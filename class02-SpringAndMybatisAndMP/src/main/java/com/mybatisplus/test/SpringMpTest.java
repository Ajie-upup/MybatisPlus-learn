package com.mybatisplus.test;

import com.mybatisplus.domain.User;
import com.mybatisplus.mapper.IUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringMpTest {

    @Autowired
    private IUserMapper userMapper;

    @Test
    public void testSelectList() throws IOException {
        List<User> users = userMapper.selectList(null);

        for (User user : users) {
            System.out.println(user);
        }
    }

}
