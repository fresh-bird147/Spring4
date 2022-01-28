package com.lfj.spring4.test;

import com.lfj.spring4.entity.Book;
import com.lfj.spring4.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lfj
 * @create 2022-01-20-10:13
 */
public class TestBook {
    @Test
    public void testJdbcTemplate1(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book=new Book(3,"java","a");
        bookService.addBook(book);
    }

    @Test
    public void testJdbcTemplate2(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        bookService.deleteBook("3");
    }

    @Test
    public void testJdbcTemplate3(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book=new Book(3,"html","b");
        bookService.updateBook(book);
    }

    @Test
    public void testJdbcTemplate4(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count=bookService.selectBook();
        System.out.println(count);
    }

    @Test
    public void testJdbcTemplate5(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = bookService.findone("1");
        System.out.println(book);
    }

    @Test
    public void testJdbcTemplate6(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> all = bookService.findAll();
        System.out.println(all);

    }

    @Test
    public void testJdbcTemplate7(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1={"4","d","5"};
        Object[] o2={"5","e","6"};
        Object[] o3={"6","f","7"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchadd(batchArgs);

    }

   @Test
    public void testJdbcTemplate8(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1={"4"};
        Object[] o2={"5"};
        Object[] o3={"6"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchdelete(batchArgs);

    }

   @Test
    public void testJdbcTemplate9(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1={"dd","5a","4"};
        Object[] o2={"ee","6b","5"};
        Object[] o3={"ff","7c","6"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchupdate(batchArgs);

    }

}
