package com.zhuo.springboot_mybatis_plus_mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuo.springboot_mybatis_plus_mysql.entity.Up;

import java.util.List;

/**
 * 泛型需要指定 当前接口所操作的实体类
 */
public interface UpMapper extends BaseMapper<Up> {

    /**
     * 查询所有用户的所有信息
     *
     * @return
     */

    List<Up> selectAllInfo() ;
}
