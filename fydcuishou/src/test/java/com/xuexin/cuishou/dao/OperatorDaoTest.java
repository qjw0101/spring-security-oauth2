//package com.xuexin.cuishou.dao;
//
//import com.xuexin.cuishou.Application;
//import com.xuexin.cuishou.domain.User;
////import com.xuexin.cuishou.domain.OperatorRepository;
////import com.xuexin.cuishou.service.IOperatorService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
///**
// * Created by wenrui on 2017/5/10.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(Application.class)
//public class OperatorDaoTest {
//
//    @Autowired
//    private OperatorRepository operatorRepository;
//
//    @Autowired
//    private IOperatorService operatorService;
//
//    @Test
//    public void test(){
//        System.out.println("-----");
//        List<User> operators =  operatorService.findAll();
//        for (User operator:operators){
//            System.out.println(operator.getUsername());
//        }
////        System.out.println(operatorDao);
////        System.out.println(operators);
//
//
//    }
//}
