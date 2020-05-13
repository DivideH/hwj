package com.hwj.demo.service;

import org.springframework.stereotype.Service;

/**
 * @Auther: heweijian
 * @Date: 2019/12/30
 * @Description:策略模式可以封装每种类型的算法，一般搭配选择器使用
 */
public interface CalculateStrategy {

    int calculate(int x, int y);

    //每个实现字类持有类型，可以进行分类
    int getType();
}
