package com.example.demo.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.log.Log;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.common.ServiceException;
import com.example.demo.entity.User;
import com.example.demo.entity.dto.UserDTO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.utils.TokenUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 战胜
 * @since 2023-05-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    private static final Log LOG = Log.get();

    @Override
    public UserDTO login(UserDTO userDTO) {
        User one = getUseInfo(userDTO,1);
        if(one != null){
            BeanUtil.copyProperties(one,userDTO,true);
            //设置token
            String token = TokenUtils.genToken(one.getId().toString(),one.getPassword());
            userDTO.setToken(token);
            return userDTO;
        }else{
            throw new ServiceException(400,"用户名或密码错误");
        }
    }

    @Override
    public UserDTO register(UserDTO userDTO) {
        User one = getUseInfo(userDTO,0);
        if(one == null){
            one = new User();
            BeanUtil.copyProperties(userDTO,one,true);
            one.setNickname("游客");
            save(one);//存入数据库
            return userDTO;
        }else{
            throw new ServiceException(400,"用户已存在");
        }
    }

    //获取用户信息
    private User getUseInfo(UserDTO userDTO, Integer type){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",userDTO.getUsername());
        if(type==1) queryWrapper.eq("password",userDTO.getPassword());
        User one;
        try{
            one = getOne(queryWrapper);
        }catch (Exception e){
            LOG.error(e);
            throw new ServiceException(500,"系统错误");
        }
        return one;
    }
}
