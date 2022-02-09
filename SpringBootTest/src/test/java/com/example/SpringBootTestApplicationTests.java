/*
 * @Author: your name
 * @Date: 2022-02-07 14:55:00
 * @LastEditTime: 2022-02-08 12:35:10
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \Spring4\SpringBootTest\src\test\java\com\example\SpringBootTestApplicationTests.java
 */
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
