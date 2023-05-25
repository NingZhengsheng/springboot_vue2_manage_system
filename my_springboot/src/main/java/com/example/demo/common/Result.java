package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.OBJ_ADAPTER;

/**
 * @author 战胜
 * @date 2023/5/6 - 16:18
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;
    public static Result result(Integer code, String msg, Object data){
        return new Result(code,msg,data);
    }
}
