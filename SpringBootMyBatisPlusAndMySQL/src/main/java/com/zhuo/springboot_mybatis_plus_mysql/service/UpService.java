package com.zhuo.springboot_mybatis_plus_mysql.service;

import com.zhuo.springboot_mybatis_plus_mysql.entity.Up;

import java.util.List;

public interface UpService {

    /**
     * 查询所有用户的信息
     * @return
     */
    List<Up> getUpAllInfo();

    /**
     * 查询用户的所有信息通过用户的id查询
     * @param upId  String
     * @return 返回用户的信息 若未查询到则返回null
     */
    Up getUpInfoByUpId(String upId);

}
