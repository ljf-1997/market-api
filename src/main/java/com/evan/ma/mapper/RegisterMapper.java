package com.evan.ma.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.evan.ma.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper extends BaseMapper<User> {
}
