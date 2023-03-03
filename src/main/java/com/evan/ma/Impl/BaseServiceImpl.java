package com.evan.ma.Impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evan.ma.service.BaseService;

import java.io.Serializable;

public class BaseServiceImpl<T extends Serializable> extends ServiceImpl<BaseMapper<T>, T> implements BaseService<T> {
}
