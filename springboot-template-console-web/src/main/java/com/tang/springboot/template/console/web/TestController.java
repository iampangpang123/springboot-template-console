package com.tang.springboot.template.console.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: ttao
 * @create: 2021-09-18 21:48
 **/
@Controller
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("hello spring-template-console ");
        return "hello spring-template-console";
    }
}
