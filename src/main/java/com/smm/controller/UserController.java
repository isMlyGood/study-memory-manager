package com.smm.controller;

import com.smm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private final TestService testService;

    public UserController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/UserRegister",method = RequestMethod.POST)
    @ResponseBody
    public String test1(String sex,String name,int age,String email,String password,String mobile,String address){
        System.out.println("controller");
        testService.saveUser(sex,name,age,email,password,mobile,address);
//        System.out.println(sex + name+age+email+password+mobile+address);
        return "成功";
    }


}
