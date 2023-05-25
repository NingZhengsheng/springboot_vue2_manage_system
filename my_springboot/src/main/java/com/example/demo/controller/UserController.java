package com.example.demo.controller;

//添加自己模板中需要的头文件
import cn.hutool.core.util.StrUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.common.Result;
import com.example.demo.entity.dto.UserDTO;
import com.example.demo.utils.TokenUtils;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;
import com.example.demo.service.IUserService;
import com.example.demo.entity.User;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/user")
public class UserController {

    //添加控制层类的逻辑代码函数
    @Resource
    private IUserService userService;

    //查询User所有的记录
    @GetMapping("")
    public List<User> findAll(){
        return userService.list();
    }

    //插入和更新
    @PostMapping("")
    public Result saveOrUpdate(@RequestBody User user){
        return Result.result(200,"操作成功",userService.saveOrUpdate(user));
    }

    //删除
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return userService.removeById(id);
    }

    //根据id查询
    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id){
        return Result.result(200,"查找成功",userService.getById(id));
    }

    //分页查询
    @GetMapping("/page")
    public Page<User> findByPage(@RequestParam Integer pageIndex,@RequestParam Integer pageSize,@RequestParam String username){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("username",username);
        queryWrapper.orderByDesc("id");
        TokenUtils.getCurrentUser();
        return userService.page(new Page(pageIndex,pageSize),queryWrapper);
    }

    // 批量删除
    @PostMapping("/del/batch")
    public boolean batchDelete(@RequestBody List<Integer> ids){
        return userService.removeByIds(ids);
    }

    //【实现表格导出excel功能】
    @GetMapping("/export")
    public void export(HttpServletResponse response) throws Exception{
        //1.从数据库查询出所有的数据
        List<User> list = userService.list();
        //通过工具类创建 writer 写出到磁盘的路径
//        ExcelWriter writer = ExcelUtil.getWriter(filesUploadPath + "/用户信息.xlsx");

        //2. 在内存操作，写到浏览器
        ExcelWriter writer = ExcelUtil.getWriter(true);
//        writer.addHeaderAlias("username","用户名");  //自定义标题别名
//        writer.addHeaderAlias("password","密码");
//        writer.addHeaderAlias("nickname","昵称");
//        writer.addHeaderAlias("email","邮箱");
//        writer.addHeaderAlias("phone","电话");
//        writer.addHeaderAlias("address","地址");
//        writer.addHeaderAlias("createTime","创建时间");

        //一次性写出 list 内的对象到 excel ，使用默认样式，强制输出标题
        writer.write(list,true);


        //3. 设置浏览器相应的格式
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        String fileName = URLEncoder.encode("用户信息","UTF-8");
        response.setHeader("Content-Disposition","attachment;filename="+fileName+".xlsx");

        //4.写回
        ServletOutputStream out = response.getOutputStream();
        writer.flush(out,true);
        out.close();
        writer.close();
    }

    //【实现导入excel】
    @PostMapping("/import")
    public void impInfo(MultipartFile multipartFile) throws  Exception{
        InputStream inputStream = multipartFile.getInputStream();
        ExcelReader reader = ExcelUtil.getReader(inputStream);
        List<User> list = reader.readAll(User.class);
        System.out.println(list);
        userService.saveBatch(list);
    }

    //【用户登录】
    @PostMapping("/login")
    public Result login(@RequestBody UserDTO userDTO){
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        System.out.println(userDTO);
        if(StrUtil.isBlank(username) || StrUtil.isBlank(password)){
            return Result.result(400,"参数错误",null);
        }
        return Result.result(200,"登录成功",userService.login(userDTO));
    }

    //【用户注册】
    @PostMapping("/register")
    public Result register(@RequestBody UserDTO userDTO){
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        System.out.println(userDTO);
        if(StrUtil.isBlank(username) || StrUtil.isBlank(password)){
            return Result.result(400,"参数错误",null);
        }
        return Result.result(200,"注册成功",userService.register(userDTO));
    }
}

