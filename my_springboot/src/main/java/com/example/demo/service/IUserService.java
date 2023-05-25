package com.example.demo.service;

import com.example.demo.common.Result;
import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.dto.UserDTO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 战胜
 * @since 2023-05-04
 */
public interface IUserService extends IService<User> {
    UserDTO login(UserDTO userDTO);
    UserDTO register(UserDTO userDTO);


}
