package com.turling.demo.entity;


import com.turling.demo.annotation.TableName;
import lombok.Data;

import java.util.Date;


@TableName("tb_user")
@Data
public class User {

    private Long id;

    private String username;

    private int state;

    private Date createdAt;

    private Date updatedAt;


}
