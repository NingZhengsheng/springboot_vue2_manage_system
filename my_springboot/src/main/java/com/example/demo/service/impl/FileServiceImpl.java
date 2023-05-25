package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.Files;
import com.example.demo.mapper.FileMapper;
import com.example.demo.service.IFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 战胜
 * @since 2023-05-25
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, Files> implements IFileService {
    @Resource
    FileMapper fileMapper;

    @Override
    public Files getFilesByMd5(String md5) {
        QueryWrapper<Files> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("md5",md5);
        List<Files> filesList = fileMapper.selectList(queryWrapper);
        return filesList.size() == 0 ? null : filesList.get(0);
    }

    @Override
    public boolean batchDelete(List<Integer> ids) {
        //select * from files where id in (id1,id2...)
        QueryWrapper<Files> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id",ids);
        queryWrapper.eq("is_delete",false);
        List<Files> files = fileMapper.selectList(queryWrapper);
        for(Files file: files) file.setIsDelete(true);
        return updateBatchById(files);
    }
}
