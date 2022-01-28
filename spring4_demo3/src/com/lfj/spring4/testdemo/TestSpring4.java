package com.lfj.spring4.testdemo;

import com.lfj.spring4.config.SpringConfig;
import com.lfj.spring4.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;
import java.awt.*;

/**
 * @author lfj
 * @create 2022-01-16-11:07
 */
public class TestSpring4 {
    @Test
    public void testService1(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService= applicationContext.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();

    }

    @Test
    public void testService2(){
        ApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService= applicationContext.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();

    }
}
