package com.evan.ma.mapper;

import com.evan.ma.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper{
    User login(String userName, String passWord);

}
