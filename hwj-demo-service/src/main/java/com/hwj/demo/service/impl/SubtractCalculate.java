package com.hwj.demo.service.impl;

import com.hwj.demo.service.CalculateStrategy;
import org.springframework.stereotype.Service;

/**
 * @Auther: heweijian
 * @Date: 2019/12/30
 * @Description:
 */
@Service
public class SubtractCalculate implements CalculateStrategy {

    @Override
    public int calculate(int x, int y) {
        return x-y;
    }

    @Override
    public int getType() {
        return 1;
    }
}
