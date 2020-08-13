package com.lagou.dao;

import com.lagou.pojo.User;

import java.util.List;

/**
 * @author xiongsm
 */
public interface IUserDao {
    List<User> findAll();

    User findByCondition(User user);
}
