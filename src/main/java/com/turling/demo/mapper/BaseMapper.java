package com.turling.demo.mapper;

import com.turling.demo.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BaseMapper {

    @Select("select * from tb_post")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    List<Post> findAll();

}
