package com.leyou.service;

import com.leyou.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User save(User user){
        user.setId(1);
        return user;

    }
}
