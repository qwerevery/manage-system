package cn.tedu.managesystem.service;


import cn.tedu.managesystem.pojo.vo.UserLoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.tedu.managesystem.mapper.UserMapper;

@Service
public class UserService {

    @Autowired(required = false)
    private UserMapper mapper;

    public String userLogin(String username, String password) {
        UserLoginVo ulv =mapper.select(username);
        if(ulv==null) return "用户名不存在!";
        if (!ulv.getPassword().equals(password)) return "密码错误!";
        return "登录成功!";
    }
}
