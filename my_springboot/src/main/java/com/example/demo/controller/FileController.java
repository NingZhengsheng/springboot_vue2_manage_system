package com.example.demo.controller;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.Result;
import com.example.demo.entity.Files;
import com.example.demo.service.IFileService;
import com.example.demo.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author 战胜
 * @date 2023/5/24 - 21:17
 * 文件上传接口
 */

@RestController
@RequestMapping("/file")
public class FileController {

    //通过注解将.yml中的配置信息加载到变量中
    @Value("${files.upload.path}")
    private String fileUploadPath;

    @Resource
    private IFileService fileService;

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile multipartFile) throws IOException {
        System.out.println("*************************");
        String originalFilename = multipartFile.getOriginalFilename();
        System.out.println("前端上传的文件：" + originalFilename);
        String type = FileUtil.extName(originalFilename);
        long size = multipartFile.getSize();

        //先存储到磁盘
        File uploadFileDir = new File(fileUploadPath);
        if(!uploadFileDir.exists()){
            uploadFileDir.mkdirs();
        }

        String newFilename = IdUtil.fastSimpleUUID() + StrUtil.DOT + type;
        File uploadFile = new File(fileUploadPath + newFilename );

        //md5 : 先上传，在获取上传文件的md5（如果md5存在，则将刚上传的文件进行删除）
        multipartFile.transferTo(uploadFile);
        String md5 = SecureUtil.md5(uploadFile);
        Files filesbymd5 = fileService.getFilesByMd5(md5);

        String res_url;
        if(filesbymd5 != null){
            uploadFile.delete();
            res_url = filesbymd5.getUrl();
        }else{
            res_url = "http://localhost:9090/file/download/" + newFilename;
        }

        //存储到数据库
        Files savaFile = new Files();
        savaFile.setFilename(originalFilename);
        savaFile.setType(type);
        savaFile.setSize(size/1024);//文件大小kb
        savaFile.setUrl(res_url);
        savaFile.setMd5(md5);
        fileService.save(savaFile);
        return res_url;
    }

    @GetMapping("/download/{fileName}")
    public void downLoad(@PathVariable String fileName, HttpServletResponse response) throws IOException {
        //1.根据文件的名获取文件
        System.out.println("----下载文件--- "+fileUploadPath + fileName);
        File downLoadFile = new File(fileUploadPath + fileName);

        //2. 设置输出格式
        response.setContentType("application/octet-stream");
        response.addHeader("Content-Disposition","attachment;filename="+URLEncoder.encode(fileName,"UTF-8"));

        //3.写回
        ServletOutputStream out = response.getOutputStream();
        out.write(FileUtil.readBytes(downLoadFile));
        out.flush();
        out.close();
    }

    //查询File所有的记录
    @GetMapping("")
    public List<Files> findAll(){
        return fileService.list();
    }

    //插入和更新
    @PostMapping("/update")
    public Result UpdateFile(@RequestBody Files files){
        return Result.result(200,"修改成功",fileService.updateById(files));
    }

    //删除
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Files files = fileService.getById(id);
        files.setIsDelete(true);
        return Result.result(200,"删除成功",fileService.updateById(files));
    }

    //根据id查询
    @GetMapping("/{id}")
    public Files findById(@PathVariable Integer id){
        return fileService.getById(id);
    }

    //分页查询
    @GetMapping("/page")
    public Page<Files> findByPage(@RequestParam Integer pageIndex,@RequestParam Integer pageSize,@RequestParam String filename){
        QueryWrapper<Files> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("filename",filename);
        queryWrapper.eq("is_delete",false);
        queryWrapper.orderByDesc("id");
        TokenUtils.getCurrentUser();
        return fileService.page(new Page(pageIndex,pageSize),queryWrapper);
    }

    // 批量删除
    @PostMapping("/del/batch")
    public boolean batchDelete(@RequestBody List<Integer> ids){
        return fileService.batchDelete(ids);
    }

}
