package com.evan.ma.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.evan.ma.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper extends BaseMapper<User> {
    User login(String userName, String passWord);

    @Select("select * from sys_user where username = #{username}")
    User getUserInfoByUsername(String username);
}
