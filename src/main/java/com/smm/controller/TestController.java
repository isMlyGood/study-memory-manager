package com.smm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {
//    登陆页跳转
    @RequestMapping(value = "test1",method = RequestMethod.GET)
    @ResponseBody
    public String success(){
        System.out.println("1");
        return "login";
    }
    @RequestMapping(value = "test2")
    public String success2(){
        System.out.println("2");
        return "login";
    }
}
