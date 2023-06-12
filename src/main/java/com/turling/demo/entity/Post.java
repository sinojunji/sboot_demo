package com.turling.demo.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Post {

    private Long id;

    private String title;

    private String content;

    private String contentHtml;

    private int hidden;

    private Date createdAt;

    private Date updatedAt;

    private Integer authorId;


}
