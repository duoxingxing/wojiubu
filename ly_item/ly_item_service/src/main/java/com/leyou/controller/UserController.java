package com.leyou.controller;

import com.leyou.pojo.User;
import com.leyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/item")
    public ResponseEntity<User> saveUser( User user){
        User save = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);

    }

}
