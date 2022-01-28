package com.lfj.spring4.dao;

import org.springframework.stereotype.Repository;

/**
 * @author lfj
 * @create 2022-01-18-15:03
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("Dao add...");
    }
}
