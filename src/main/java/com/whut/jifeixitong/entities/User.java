package com.whut.jifeixitong.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("userinfo")
public class User {
    private Integer id;
    private String username;
    private String password;
    private String usertype;
    private Integer position;
}