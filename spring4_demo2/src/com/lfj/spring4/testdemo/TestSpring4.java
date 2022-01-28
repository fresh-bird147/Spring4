package com.lfj.spring4.testdemo;

import com.lfj.spring4.autowire.Emp;
import com.lfj.spring4.bean.Orders;
import com.lfj.spring4.collectiontype.Book;
import com.lfj.spring4.collectiontype.Course;
import com.lfj.spring4.collectiontype.Stu;
import com.lfj.spring4.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lfj
 * @create 2022-01-16-11:07
 */
public class TestSpring4 {
    @Test
    public void testCollection(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu=context.getBean("stu",Stu.class);
        stu.test();
    }

    @Test
    public void testCollection2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Book book1=context.getBean("book",Book.class);
        Book book2=context.getBean("book",Book.class);
        System.out.println(book1);
        System.out.println(book2);

        //book.test();
    }

    @Test
    public void testCollection3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
        Course course=context.getBean("MyBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testbean(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders=context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean对象");
        System.out.println(orders);

        //手动让bean实例销毁
        context.close();
    }

    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean5.xml");
       Emp emp=context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
