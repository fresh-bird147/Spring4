package com.lfj.spring4.test;

import com.lfj.spring4.aopanno.User;
import com.lfj.spring4.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lfj
 * @create 2022-01-19-15:45
 */
public class TestAop {

    @Test
    public void testAopAnno(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();

    }

    @Test
    public void testAopXml(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book=context.getBean("book",Book.class);
        book.buy();

    }
}
