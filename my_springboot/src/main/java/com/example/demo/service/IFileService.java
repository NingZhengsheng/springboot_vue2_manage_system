package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Files;

import java.util.List;
public interface IFileService extends IService<Files> {
    Files getFilesByMd5(String md5);
    boolean batchDelete(List<Integer> ids);
}
