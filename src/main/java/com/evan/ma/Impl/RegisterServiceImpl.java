package com.evan.ma.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evan.ma.entity.User;
import com.evan.ma.mapper.RegisterMapper;
import com.evan.ma.setvice.RegisterService;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, User> implements RegisterService {
}
