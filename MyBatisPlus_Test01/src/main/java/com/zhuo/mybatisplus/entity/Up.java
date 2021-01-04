package com.zhuo.mybatisplus.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Up {

    /**
     * 用户的id
     */
    public String upid;
    /**
     * 用户的账号
     */
    private String upaccount;
    /**
     * 用户的密码
     */
    private String uppassword;
    /**
     * 用户的名称
     */
    private String upname;
    /**
     * 用户的电话
     */
    private String upphone;
    /**
     * 用户的头像
     */
    private String uppicture;
    /**
     * 用户的权限
     */
    private Integer upstatus;

    /**
     * 用户的生日
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date upbirthday;

    /**
     * 用户种类
     */
    private Integer upclass;
}
