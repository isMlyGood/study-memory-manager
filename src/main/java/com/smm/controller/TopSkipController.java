package com.smm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TopSkipController {
    /**
     * 跳转登陆页面
     * @return
     */
    @RequestMapping(value = "skipLogin",method = RequestMethod.GET)
    public ModelAndView skipLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
    /**
     * 跳转注册页面
     * @return
     */
    @RequestMapping(value = "skipRegister",method = RequestMethod.GET)
    public ModelAndView skipRegister() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }
}
