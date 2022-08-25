package com.evan.ma.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@TableName("sys_user")
public class User implements Serializable {
    @Id
    private String id;
    @TableField("username")
    private String userName;
    @TableField("password")
    private String passWord;
    private Integer status;
}
