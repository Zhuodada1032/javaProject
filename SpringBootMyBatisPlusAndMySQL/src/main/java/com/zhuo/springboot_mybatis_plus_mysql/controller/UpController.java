package com.zhuo.springboot_mybatis_plus_mysql.controller;

import com.zhuo.springboot_mybatis_plus_mysql.entity.Up;
import com.zhuo.springboot_mybatis_plus_mysql.service.UpService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController()
public class UpController {

    @Resource
    UpService upService;

    /**
     * 通过get方式访问
     *
     * @return
     */
    @RequestMapping(value = {"/upInfo"}, method = RequestMethod.GET)
    public List<Up> getAllUpInfo() {

        return upService.getUpAllInfo();
    }

    @RequestMapping(value = {"/upInfo/{upId}"}, method = RequestMethod.GET)
    public Up getUpInfoByUpId(@PathVariable("upId") String upId) {
        return upService.getUpInfoByUpId(upId);
    }

}
