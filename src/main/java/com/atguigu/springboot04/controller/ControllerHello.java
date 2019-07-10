package com.atguigu.springboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

//@RestController
@Controller
public class ControllerHello {

    @RequestMapping({"/","login.html"})
    public String index(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String sayhello(){
        return "HelloWord !";
    }
    @RequestMapping("/success")
    public String saysuccess(Map<String,Object> map) {
        //Thymeleaf会在template下寻找success.html
        map.put("hello","<h1>你好！</h1>");
        map.put("user", Arrays.asList("lisi","zhangsan","wangwu"));

        return "success";
    }
}
