package cn.tedu.managesystem.controller;

import cn.tedu.managesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired(required = false)
    private UserService service;

    @RequestMapping("/login")
    public String login(String username,String password){
            return service.userLogin(username,password);
    }
}
