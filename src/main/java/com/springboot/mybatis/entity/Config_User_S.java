package com.springboot.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor                 //无参构造
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Config_User_S {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    private String userName;
    private String password;
    private String name;
    private String phoneNum;
    private Integer isActive;
    private Integer isEdit;
    private long organizationId;
    private long sid;
    private Integer isWxUser;
    private String avatarUrl;
    private String openId;
    private String sessionKey;
}

