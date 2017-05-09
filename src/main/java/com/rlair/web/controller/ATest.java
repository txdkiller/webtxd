package com.rlair.web.controller;

import com.rlair.web.model.User;
import com.rlair.web.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by TXD on 2017/5/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mvc.xml","classpath*:spring-mybatis.xml"})
public class ATest {
    @Resource
    private UserService userService;
    @Test
    public void Test()
    {
        List<User> s=userService.getAllUser();
        for (User item:s
             ) {
            System.out.println(item.getUserName());
        }
        System.out.println("test run");
    }
}
