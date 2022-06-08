package com.evan.ma.setvice;

import com.evan.ma.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    User login(String userName, String passWord);
}