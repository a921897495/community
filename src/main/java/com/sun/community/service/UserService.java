package com.sun.community.service;

import com.sun.community.mapper.UserMapper;
import com.sun.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void createOrUpdate(User user) {

        User dbUser =userMapper.findByAccountId(user.getAccountId());

        if (dbUser ==null){
            //插入
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            userMapper.insert(user);
        }else {
            //更新
            dbUser.setGmtCreate(System.currentTimeMillis());
            dbUser.setGmtModified(user.getGmtCreate());
            dbUser.setToken(user.getToken());
            userMapper.update(dbUser);
        }

    }
}
