package com.lfj.spring4.testdemo;

import com.lfj.spring4.Book;
import com.lfj.spring4.Orders;
import com.lfj.spring4.User;
import com.lfj.spring4.bean.Emp;
import com.lfj.spring4.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lfj
 * @create 2022-01-15-11:18
 */
public class TestBean {
    //测试1
    @Test
    public void testbean1(){
        //1 加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");

        //2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testbean2(){
        //1 加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");

        //2 获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
