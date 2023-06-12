package com.turling.demo.controller;

import com.turling.demo.config.MessageObject;
import com.turling.demo.entity.Post;
import com.turling.demo.service.IPostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/test")
@Controller
public class BaseController {

    @Resource
    private IPostService postService;

    @PostMapping("/query")
    @ResponseBody
    public MessageObject findPost(){
        List<Post> postList = postService.findAll();

        return new MessageObject(MessageObject.OK,"",postList);
    }

}
