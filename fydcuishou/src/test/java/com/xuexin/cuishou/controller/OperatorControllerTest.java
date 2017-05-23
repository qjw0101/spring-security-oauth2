package com.xuexin.cuishou.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by wenrui on 2017/5/11.
 */
//测试参考 ： https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html
//http://stackoverflow.com/questions/28281272/spring-mockmvcbuilders-security-filter
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class OperatorControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    FilterChainProxy springSecurityFilterChain;


    @Test
    public void testOpertors() throws Exception{
//        springSecurityFilterChain
        MockMvc mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        String a = mvc.perform(MockMvcRequestBuilders.post("/operators"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("asda:"+a);
    }



}
