package com.hwua.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
@AllArgsConstructor
public class User {

    private Integer id;
    private String username;
    private String password;
    private String realname;
    private String phone;
    private String email;
    private String status;


}
