package com.example.controller;

import com.example.entity.UserData;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lfj
 * @create 2022-02-04-14:38
 */

@Slf4j
@Controller
public class MainController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        //Session代替Id
        MDC.put("reqId",request.getSession().getId());
        log.info("login页面被访问");
        return "login";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        log.info("index页面被访问");
        return "index";
    }

    @RequestMapping("/student")
    @ResponseBody
    public UserData student() {
        UserData student = new UserData();
        student.setUsername("小明");
        student.setRole("学生");
        student.setId(10);
        return student;
    }
}