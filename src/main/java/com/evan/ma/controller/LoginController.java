package com.evan.ma.controller;

import com.evan.ma.entity.Result;
import com.evan.ma.entity.User;
import com.evan.ma.setvice.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody Map map, HttpSession session) {
        Result result = new Result();
        String userName = String.valueOf(map.get("username"));
        String passWord = String.valueOf(map.get("password"));
        User user = loginService.login(userName, passWord);
        if (user == null) {
            result.setData(user);
            result.setCode(0);
            result.setMsg("failed");
        } else {
            result.setData(user);
            result.setCode(1);
            result.setMsg("successful");
            session.setAttribute("user",user);
        }
        return result;
    }
}
