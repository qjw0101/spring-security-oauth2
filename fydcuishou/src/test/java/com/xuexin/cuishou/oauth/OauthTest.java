package com.xuexin.cuishou.oauth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Base64Utils;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by wenrui on 2017/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class OauthTest {

//    private Webcli
//    @Autowired
//    private MockMvc mvc;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    public void asda() throws Exception {
        String authorization = "Basic "
                + new String(Base64Utils.encode("trusted-app:secret".getBytes()));
        String contentType = MediaType.APPLICATION_JSON + ";charset=UTF-8";
        System.out.println(authorization);
    }

    @Test
    public void getAccessToken() throws Exception {

        MockMvc mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        String a = mvc.perform(MockMvcRequestBuilders.post("/operators"))
                .andReturn().getResponse().getContentAsString();
        System.out.println("asda:"+a);

    }
}
