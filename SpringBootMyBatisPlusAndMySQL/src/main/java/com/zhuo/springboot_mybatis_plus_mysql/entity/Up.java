package com.zhuo.springboot_mybatis_plus_mysql.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Up {

    private String upid;

    private String upaccount;

    private String uppassword;

    private String upname;

    private String upphone;

    private String uppicture;

    private Integer upstatus;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date upbirthday;

    private Integer upclass;
}
