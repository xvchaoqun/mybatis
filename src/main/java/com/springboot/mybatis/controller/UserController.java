package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.Config_User_S;
import com.springboot.mybatis.mapper.UserMapper;
import com.springboot.mybatis.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@Component
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/select", method = RequestMethod.POST)
    @ResponseBody
    public List<Config_User_S> selectList(@RequestBody Config_User_S config_user_s) {
        System.out.println(config_user_s);
        return userMapper.get(config_user_s);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Integer addList(@RequestBody Config_User_S config_user_s) {
        return userMapper.add(config_user_s);
    }

}
