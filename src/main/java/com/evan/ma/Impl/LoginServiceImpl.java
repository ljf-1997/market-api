package com.evan.ma.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evan.ma.entity.User;
import com.evan.ma.mapper.LoginMapper;
import com.evan.ma.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper,User> implements LoginService {
    @Autowired(required = true)
    private LoginMapper loginMapper;

    @Override
    public User login(String userName, String passWord) {
        return loginMapper.login(userName, passWord);
    }

    @Override
    public User getUserInfo(String username){
        return loginMapper.getUserInfoByUsername(username);
    }
}
