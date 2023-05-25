package com.example.demo.entity.dto;
import lombok.Data;
import lombok.ToString;

/**
 *  直接接收前端请求参数
 */
@Data
@ToString
public class UserDTO {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String avatar;
    private String token;
}
