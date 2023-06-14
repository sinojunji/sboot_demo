package com.turling.demo.mapper;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaseMapper<T> {

    @Select("select * from ${tableName}")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    List<T> findAll(@Param("tableName")String tableName);

    @Select("select * from ${tableName}")
    Page<T> findAllByPage(@Param("tableName")String tableName);

}
