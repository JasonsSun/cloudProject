package com.usercloud.user.mapper;

import com.usercloud.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}