package com.lfj.spring4.test;



import com.lfj.spring4.config.Txconfig;
import com.lfj.spring4.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import java.awt.print.Book;
import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lfj
 * @create 2022-01-20-10:13
 */
public class TestBook {

    @Test   //注解式开启事务
    public void testAccount(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    @Test   //配置xml文件开启事务
    public void testAccount2(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    @Test   //完全注解开启事务开启事务
    public void testAccount3(){
        ApplicationContext context=
                new AnnotationConfigApplicationContext(Txconfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }
}
