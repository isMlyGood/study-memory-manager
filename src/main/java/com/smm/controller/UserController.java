package com.smm.controller;

import com.smm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 登陆
     */

    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    @ResponseBody
    public String userLogin(String username,String password){
        System.out.println(username + password);
        return "成功";
    }

    /**
     * 注册
     */


    @RequestMapping(value = "/userRegister",method = RequestMethod.POST)
    @ResponseBody
    public String userRegister(String sex,String name,int age,String email,String password,String mobile,String address){
        System.out.println(sex+name+age+email+password+mobile+address);
        userInfoService.addUser(sex,name,age,email,password,mobile,address);
        return "成功";
    }


}
