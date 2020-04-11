package com.smm.controller;


import com.smm.entity.Test;
import com.smm.service.TestService;
import com.smm.service.impl.TestServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @RequestMapping(value = "login1",method = RequestMethod.GET)
    @ResponseBody
    public List<Test> doTest() {
        System.out.println("1");
        TestService testService = new TestServiceImpl();
        List<Test> data = testService.Testone();
        System.out.println("2");
        return data;
    }

    @RequestMapping(value = "login2",method = RequestMethod.GET)
//    @ResponseBody
    public ModelAndView doTest2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        System.out.println("123");
        return modelAndView;
    }

    @RequestMapping(value = "login3",method = RequestMethod.GET)
    public ModelAndView doTest3() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        System.out.println("1234");
        return modelAndView;
    }
}
