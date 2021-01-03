package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.Config_User_S;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
//    数据查询
    @Select("select c.name,c.userName,c.phoneNum from [router_s_yang].[dbo].[Config_User_S] c inner join [router_s_yang].[dbo].[Config_Organization_S] l on l.id = #{config_user_s.id} and c.id = #{config_user_s.id}")
    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "userName", column = "userName"),
            @Result(property = "phoneNum", column = "phoneNum")
    })
    public List<Config_User_S> get(@Param("config_user_s") Config_User_S config_user_s);

//    数据添加
    @Insert("insert into Config_User_S(userName, name, phoneNum, password) values(#{config_user_s.userName}, #{config_user_s.name}, #{config_user_s.phoneNum}, #{config_user_s.password})")
    public Integer add(@Param("config_user_s") Config_User_S config_user_s);

}

