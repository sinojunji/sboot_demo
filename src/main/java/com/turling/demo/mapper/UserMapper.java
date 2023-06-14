package com.turling.demo.mapper;

import com.github.pagehelper.Page;
import com.turling.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
