package com.turling.demo;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.turling.demo.entity.User;
import com.turling.demo.service.impl.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class ApplicationTests {

    @Resource
    UserService userService;

    @Test
    public void findAll() {
        List<User> users = userService.selectAll();
        assertEquals(1, users.size());
//        PageInfo<User> pageable = new PageInfo<User>();
//        pageable.setPageSize(5);
//        try (Page<User> result = userService.findAllByPage(pageable)) {
//            assertEquals(1, result.size());
//        }
    }

}
