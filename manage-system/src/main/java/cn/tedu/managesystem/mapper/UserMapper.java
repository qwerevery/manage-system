package cn.tedu.managesystem.mapper;

import cn.tedu.managesystem.pojo.vo.UserLoginVo;

public interface UserMapper {
    UserLoginVo select(String username);
}
