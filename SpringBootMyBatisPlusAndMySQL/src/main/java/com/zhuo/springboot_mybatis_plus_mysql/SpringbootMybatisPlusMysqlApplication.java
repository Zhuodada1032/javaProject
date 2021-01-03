package com.zhuo.springboot_mybatis_plus_mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhuo.springboot_mybatis_plus_mysql.mapper")
public class SpringbootMybatisPlusMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPlusMysqlApplication.class, args);
    }

}
