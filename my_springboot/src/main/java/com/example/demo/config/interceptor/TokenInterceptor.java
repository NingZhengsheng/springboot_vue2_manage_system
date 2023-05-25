package com.example.demo.config.interceptor;


import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.example.demo.common.ServiceException;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    private IUserService userService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        /** 地址过滤 */
        String uri = request.getRequestURI() ;
        if (uri.contains("/login")) return true;
        //如果不是映射到方法 直接通过
        if(!(handler instanceof HandlerMethod)) return true;

        //执行验证
        String token = request.getHeader("token");
        if(StrUtil.isBlank(token)){
            throw new ServiceException(401,"token不能为空,请重新登录");
        }
        //获取 token 中的 userId
        String userId;
        try{
            userId = JWT.decode(token).getAudience().get(0);
            System.out.println("Token - userId：" + userId);
        }catch (JWTDecodeException e){
            throw new ServiceException(401,"token 验证失败,请重新登录");
        }
        User user = userService.getById(userId);
        if(user == null) throw new ServiceException(401,"用户不存在，请重新登陆");
        //用户密码加签验证 token
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
        try{
            jwtVerifier.verify(token);
        }catch (JWTVerificationException e){
            throw new ServiceException(401,"token 验证失败,请重新登录");
        }
        return true;
    }
}