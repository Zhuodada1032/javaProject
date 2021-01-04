package com.zhuo.springboot_mybatis_plus_mysql.service;

import com.zhuo.springboot_mybatis_plus_mysql.entity.Up;
import com.zhuo.springboot_mybatis_plus_mysql.mapper.UpMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UpServiceImpl implements UpService {

    @Resource
    private UpMapper upMapper;

    @Override
    public List<Up> getUpAllInfo() {
        return upMapper.selectAllInfo();
    }
}
