package com.gupaoedu.vip.file;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * http://localhost:8082/file/download/news1.jpg
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//屏蔽掉数据库的设置，这里不需要用到数据库
public class MallFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallFileApplication.class,args);
    }
}
