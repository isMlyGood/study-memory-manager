package com.smm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 页面跳转相关控制器
 */
@Controller
@RequestMapping("/")
public class TopSkipController {
    /**
     * 跳转登陆页面
     * @return login
     * @method GET
     */
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String skipLogin() {
        System.out.println("跳转至登陆页面...");
        return "login";
    }
    /**
     * 跳转到注册页面GET
     * @return register
     * @method GET
     */
    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String skipRegister() {
        System.out.println("跳转至注册页面...");
        return "register";
    }
//    /**
//     * 注册成功后转发到登陆页面POST
//     * @return
//     * @method POST
//     */
//    @RequestMapping(value = "register",method = RequestMethod.POST)
//    public String skipRegisterAfterLoginSuccess() {
//        System.out.println("注册成功，返回登陆页面...");
//        return "login";
//    }

    /**
     * 登陆成功-success页面
     * @return success
     * @method GET
     */
    @RequestMapping(value = "/success",method = RequestMethod.GET)
    public String loginSuccess1() {
        System.out.println("success：登陆成功");
        return "success";
    }
    /**
     * 登陆失败-failure页面
     * @return success
     * @method GET
     */
    @RequestMapping(value = "/failure",method = RequestMethod.GET)
    @ResponseBody
    public String loginFailure1() {
        System.out.println("success：登陆失败");
        return "failure了，没有这个页面，自己去做下";
    }

}
