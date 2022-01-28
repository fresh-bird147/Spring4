package com.lfj.spring4.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author lfj
 * @create 2022-01-25-14:44
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //lucy转账100给mary
    @Override
    public void addmoney() {
        String sql="update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"lucy");
    }

    @Override
    public void reducemoney() {
        String sql="update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mary");
    }
}
