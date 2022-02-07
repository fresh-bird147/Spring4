package com.example.controller;

import com.example.entity.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lfj
 * @create 2022-02-04-14:38
 */

@Controller
public  class MainController {

    @RequestMapping("/first")
    public String first(){
        return "first";
    }
    @RequestMapping("/second")
    public String second(){
        return "second";
    }
    @RequestMapping("/video")
    public String video(){
        return "video";
    }
    @RequestMapping("/fly")
    public String fly(){
        return "fly";
    }

    @RequestMapping("/student")
    @ResponseBody
    public UserData student(){
        UserData student = new UserData();
        student.setUsername("小明");
        student.setRole("学生");
        student.setId(10);
        return student;
    }
}