package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 战胜
 * @since 2023-05-04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
