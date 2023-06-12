package com.turling.demo;

import com.github.pagehelper.PageInfo;
import com.turling.demo.entity.Post;
import com.turling.demo.service.IPostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class ApplicationTests {
    @Autowired
    IPostService postService;

    @Test
    public void findAll() {
        PageInfo<Post> pageable = new PageInfo<Post>();
        pageable.setPageSize(5);
        List<Post> result = postService.findAll();
        assertEquals(1, result.size());
    }

}
