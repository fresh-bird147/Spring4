package com.lfj.spring4.factorybean;

import com.lfj.spring4.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author lfj
 * @create 2022-01-17-10:07
 */
public class MyBean implements FactoryBean<Course> {

    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
