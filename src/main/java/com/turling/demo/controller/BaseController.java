package com.turling.demo.controller;

import com.turling.demo.config.MessageObject;

import com.turling.demo.service.impl.UserService;
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
    private UserService userService;

    @PostMapping("/query")
    @ResponseBody
    public MessageObject findPost(){
        return new MessageObject(MessageObject.OK,"",userService.selectAll());
    }

}
