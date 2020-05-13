package com.hwj.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: heweijian
 * @Date: 2020/3/3
 * @Description:
 */
@Configuration
public class BeanTest {

    @Bean
    public BeanData getBean() {
        BeanData beanData = new BeanData();
        beanData.setBeanName("getBean");
        return beanData;
    }

    @Bean
    public BeanDataCollect getBeanCollect(BeanData beanData) {
        System.out.println(beanData);
        beanData.setId(2);
        BeanDataCollect beanDataCollect = new BeanDataCollect();
        beanDataCollect.setBeanData(beanData);
        return beanDataCollect;
    }

}
