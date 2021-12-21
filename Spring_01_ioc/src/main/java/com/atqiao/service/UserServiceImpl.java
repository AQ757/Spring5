package com.atqiao.service;

import com.atqiao.dao.UserDao;
import com.atqiao.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    //利用set实现
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.gerUser();
    }
}
