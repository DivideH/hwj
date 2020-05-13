package com.hwj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Auther: heweijian
 * @Date: 2019/12/28
 * @Description:
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HwjDemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwjDemoServiceApplication.class,args);
    }
}
