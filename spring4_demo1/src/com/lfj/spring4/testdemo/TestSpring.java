package com.lfj.spring4.testdemo;

import com.lfj.spring4.Book;
import com.lfj.spring4.Orders;
import com.lfj.spring4.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lfj
 * @create 2022-01-15-11:18
 */
public class TestSpring {
    //测试1
    @Test
    public void testadd(){
        //1 加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    //测试2
    @Test
    public void testBook1(){
        //1 加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
        book.testDemo();
    }

    //测试3
    @Test
    public void testOreders(){
        //1 加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.orderTest();
    }
}
