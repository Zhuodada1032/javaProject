package com.zhuo.springboot_mybatis_plus_mysql.mapper;

import com.zhuo.springboot_mybatis_plus_mysql.entity.Up;

import java.util.List;

public interface UpMapper {

    /**
     * 查询所有用户的所有信息
     * @return
     */
    List<Up> selectAllInfo();
}
