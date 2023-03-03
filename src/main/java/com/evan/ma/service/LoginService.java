package com.evan.ma.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evan.ma.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface LoginService extends IService<User> {
    User login(String userName, String passWord);

    User getUserInfo(String username);
}