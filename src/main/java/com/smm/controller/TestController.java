package com.smm.controller;


import com.alibaba.fastjson.JSONObject;
import com.smm.entity.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/testI")
public class TestController {

    //   help
    @RequestMapping(value = "help",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String helpGet(){
        String sb = "接口说明：\r\n" +
                "  get：\r\n" +
                "    IP：192.168.1.11\n" +
                "    PORT:8080\n" +
                "    URL:/test/{get01}{get02}\n" +
                "    PARAM:name/pwd\n" +
                "    TYPE:String\n" +
                "  post：\r\n" +
                "    IP：192.168.1.11\n" +
                "    PORT:8080\n" +
                "    URL:/test/post01\n" +
                "    PARAM:name;pwd;zxzpost\n" +
                "    TYPE:String\n" +
                "";
        System.out.println("help" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
        return sb;
    }

    //   测试get
    @RequestMapping(value = "get01",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String csGET(@RequestParam(value="name") String name, @RequestParam(value="pwd")String pwd){
        JSONObject jsonObject = new JSONObject();
        ArrayList<String> slist = new ArrayList<String>();
        slist.add("测试1");
        slist.add("测试2");
        jsonObject.put("j1","put1");
        jsonObject.put("j2","put2");
        jsonObject.put("j3",slist);
        jsonObject.put("name",name);
        jsonObject.put("pwd",pwd);
        jsonObject.put("请求类型","这个是GET请求");
        System.out.println("get01" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
//        return "success";
        return JSONObject.toJSON(jsonObject).toString();
    }

    //   测试get
    @RequestMapping(value = "get02",method = RequestMethod.GET)
    public String xmGET(@RequestParam(value="name") String name, @RequestParam(value="pwd")String pwd){
        System.out.println(name + pwd + "get02");
        return "success";
    }

    //   测试post
    @RequestMapping(value = "post01",method = RequestMethod.POST)
    public String csPOST(@RequestParam(value="name") String name, @RequestParam(value="pwd")String pwd,@RequestParam(value="zxzpost")String zxzpost){
        JSONObject jsonObject = new JSONObject();
        ArrayList<String> pList = new ArrayList<String>();
        pList.add("测试1");
        pList.add("测试2");
        jsonObject.put("json3",pList);
        jsonObject.put("name",name);
        jsonObject.put("pwd",pwd);
        jsonObject.put("zxzpost",zxzpost);
        jsonObject.put("请求类型","这个是POST请求");
        System.out.println("post" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()) + name + pwd + zxzpost);
//        return "success";
        return JSONObject.toJSON(jsonObject).toString();
    }

////    登陆页跳转
//    @RequestMapping(value = "test1",method = RequestMethod.GET)
//    @ResponseBody
//    public String success(){
//        System.out.println("1");
//        return "login";
//    }
//    @RequestMapping(value = "test2")
//    public String success2(){
//        System.out.println("2");
//        return "login";
//    }
//
//    @RequestMapping(value = "login2",method = RequestMethod.GET)
////    @ResponseBody
//    public ModelAndView doTest2() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("login");
//        System.out.println("123");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "login3",method = RequestMethod.GET)
//    public ModelAndView doTest3() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("register");
//        System.out.println("1234");
//        return modelAndView;
//    }
}
