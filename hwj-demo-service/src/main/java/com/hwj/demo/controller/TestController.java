package com.hwj.demo.controller;

import com.hwj.demo.annotation.DemoAnnotation;
import com.hwj.demo.bean.BeanDataCollect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: heweijian
 * @Date: 2019/12/28
 * @Description:
 */
@RequestMapping(value = "/user")
@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sayHello() {
//        UserModel user = new UserModel();
        return "hello";
    }

    //springmvc 访问
    @RequestMapping(value = "/",method = RequestMethod.GET)
    @DemoAnnotation
    public void springMvcAnnotation(){
        System.out.println("test annotation");
    }

    @RequestMapping(value = "/Bean",method = RequestMethod.GET)
    public BeanDataCollect getBeanDataCollect(){
        System.out.println(beanDataCollect);
        return beanDataCollect;
    }

    @Autowired
    private BeanDataCollect beanDataCollect;
}
