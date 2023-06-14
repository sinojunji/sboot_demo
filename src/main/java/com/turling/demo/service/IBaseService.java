package com.turling.demo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.turling.demo.mapper.BaseMapper;

import javax.annotation.Resource;
import java.util.List;

public interface IBaseService<T> {

    public List<T> selectAll();

    public Page<T> findAllByPage(PageInfo<T> pageable);
}
