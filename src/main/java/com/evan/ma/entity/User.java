package com.evan.ma.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "sys_user")
public class User {
    @Id
    private Long id;
    private String userName;
    private String passWord;
    private Integer status;
}
