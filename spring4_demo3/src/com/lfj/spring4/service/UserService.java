package com.lfj.spring4.service;

import com.lfj.spring4.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lfj
 * @create 2022-01-18-14:43
 */

//在注解里面value属性值可以不写
//默认值是类名称，首字母小写
//@Component(value = "userService")   //<bean id="userService" class=".."/>
@Service
public class UserService {

    //定义dao类型属性
    //不需要添加set方法，添加注入属性注解
    // @Autowired  //根据类型进行自动注入
    // @Qualifier(value = "userDaoImpl1")  //根据名称注入
    // private UserDao userDao;

    @Value(value = "abc")   //value普通值注入
    private String name;

    //@Resource //根据类型进行自动注入
    @Resource(name = "userDaoImpl1")  //根据名称注入
    private UserDao userDao;

    public void add(){
        System.out.println("Service add....."+name);
        userDao.add();
    }
}
