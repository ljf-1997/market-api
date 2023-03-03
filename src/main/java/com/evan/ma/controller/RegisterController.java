package com.evan.ma.controller;

import com.evan.ma.entity.Result;
import com.evan.ma.entity.User;
import com.evan.ma.service.RegisterService;
import com.evan.ma.utils.KeyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController{

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RegisterService registerService;

    @ResponseBody
    @PostMapping("/add")
    public Result<Integer> add(@RequestBody User entity) throws Exception {
        Result result = new Result();
        try {
            entity.setId(KeyUtil.getKey());
            entity.setStatus(1);
            Boolean data = registerService.save(entity);
            result.setData(data);
        }  catch (Exception e) {
            result.setCode(1);
            logger.error(e.getMessage(), e);
        }
        return result;
    }
}
