package com.xuexin.cuishou.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chandler on 2017/5/9.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/hello2",method = RequestMethod.DELETE)
    public ResponseEntity hello(){
        return ResponseEntity.ok("hello");
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.POST)
    public ResponseEntity hello2(){
        return ResponseEntity.ok("hello2");
    }

}
