package com.example;

import com.example.student.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class SpringBootTestApplicationTests {
    @Value("${test.name}")
    String name;

    @Resource
    Student student;

    @Test
    void contextLoads() {
        System.out.println(student);
        System.out.println(name);
    }

}
