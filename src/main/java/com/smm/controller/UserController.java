package com.smm.controller;

import com.smm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserInfoService userInfoService;
    /**
     * 登陆
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String userLogin(String username,String password) {
        System.out.println("用户" + username + "登陆进来了" + password);
        int logo = 1;
        if (logo == 1){
            System.out.println("用户" + username + "登陆进来了" + password);
            return "success";
        }
        return "login";
    }


    /**
     * 注册
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public String userRegister(String sex,String name,int age,String email,String password,String mobile,String address){
        System.out.println(sex+name+age+email+password+mobile+address);
//        int logo = userInfoService.addUser(sex, name, age, email, password, mobile, address);
        System.out.println(1);
//        if (1 == 1){
//            System.out.println("用户" + name + "注册进来了" + password);
//            return "login";
//        }
        return "login";

    }

}
