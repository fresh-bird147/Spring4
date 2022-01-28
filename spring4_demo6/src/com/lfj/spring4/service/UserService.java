package com.lfj.spring4.service;

import com.lfj.spring4.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lfj
 * @create 2022-01-25-14:28
 */
@Service
@Transactional(readOnly = false,timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney(){

        //try {
            //lucy少100
            userDao.reducemoney();

            int i=1/0;
            //mary多100
            userDao.addmoney();
        //}catch (Exception e){
        //
        //}

    }
}
