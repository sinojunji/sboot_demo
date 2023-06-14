package com.turling.demo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.turling.demo.entity.User;
import com.turling.demo.mapper.UserMapper;
import com.turling.demo.service.IBaseService;
import com.turling.demo.service.IUserService;
import com.turling.demo.utils.EntityUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Type;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.findAll(EntityUtils.getTableName(User.class));
    }

    @Override
    public Page<User> findAllByPage(PageInfo<User> pageable) {
        PageHelper.startPage(pageable);
        return userMapper.findAllByPage(EntityUtils.getTableName(User.class));
    }
}
