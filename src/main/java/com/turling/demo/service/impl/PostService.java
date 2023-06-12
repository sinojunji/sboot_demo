package com.turling.demo.service.impl;

import com.turling.demo.entity.Post;
import com.turling.demo.mapper.BaseMapper;
import com.turling.demo.service.IPostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PostService implements IPostService {

    @Resource
    private BaseMapper mapper;


    @Override
    public List<Post> findAll() {
        return mapper.findAll();
    }
}
