package com.evan.ma.entity;

import lombok.Data;

@Data
public class Result<T> {
    /*响应码*/
    private int code;
    /*响应消息*/
    private String msg;
    /*数据单元*/
    private T data;

    public Result(){}

    public Result(T data) {
        this.data = data;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
