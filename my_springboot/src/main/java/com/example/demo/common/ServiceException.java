package com.example.demo.common;

import lombok.Getter;

/**
 * @author 战胜
 * @date 2023/5/6 - 17:10
 * ServiceException是我们自定义的一种异常
 */
@Getter
public class ServiceException extends RuntimeException{
    private Integer code;
    /**
     * 自定义错误类型
     * @param code 自定义的错误码
     * @param msg 自定义的错误提示
     */
    public ServiceException(Integer code, String msg){
        super(msg);
        this.code = code;
    }
}
