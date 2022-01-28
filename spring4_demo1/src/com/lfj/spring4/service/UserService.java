package com.lfj.spring4.service;

import com.lfj.spring4.dao.UserDao;
import com.lfj.spring4.dao.UserDaoImpl;

/**
 * @author lfj
 * @create 2022-01-15-15:39
 */
public class UserService {

    //创建UserDao类型属性，生成set方法
    private  UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add......");

        userDao.update();
        //原始创建UserDao对象
        //UserDao userDao=new UserDaoImpl();
        //userDao.update();
    }
}
