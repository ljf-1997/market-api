package com.evan.ma.Impl;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
    public static void main(String[] args) {
        String driver="com.mysql.jdbc.Driver";//数据库驱动类所对应的字符串
        String URL="jdbc:mysql://124.222.188.137:3306/sys";
        Connection conn=null;
        try {
            Class.forName(driver);//加载MySQL数据库驱动
        }catch(java.lang.ClassNotFoundException e) {//如果找不到这个类，执行下面的异常处理
            System.out.println("驱动程序配置未配置成功!!!");
        }
        try {
            conn= DriverManager.getConnection(URL,"root","root");//建立和数据库的连接，并返回表示连接的Connection对象
            System.out.println("数据库连接成功!!!");
        }catch(Exception e) {//未连接成功，执行下面的异常处理
            System.out.println("数据库连接失败!!!");
        }
    }
}
