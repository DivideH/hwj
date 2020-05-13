package com.hwj.demo.service;

import com.hwj.demo.service.impl.AddCalculate;
import com.hwj.demo.service.impl.SubtractCalculate;
import org.springframework.stereotype.Service;

/**
 * @Auther: heweijian
 * @Date: 2019/12/30
 * @Description:
 */
@Service
public class CalculateService {


    //des:使用哪一种计算方式.0加1减
    public int getResult(int money, int number, int type) {
        //比选择器switch，if--else的优化，工厂
      //简单工厂模式，通过map直接关系获取就能省略判断，每个实现类持有这个type方法（接口规约）进行分类
        CalculateFactory instance = CalculateFactory.getInstance();
        CalculateStrategy calculateStrategy = instance.getCalculateStrategy(type);
        return calculateStrategy.calculate(money,number);
    }

    public static void main(String[] args) {
        CalculateService calculateService = new CalculateService();
        System.out.println(calculateService.getResult(100, 100, 1));
        System.out.println(calculateService.getResult(100, 100, 0));
    }

//    选择器
//          if (type == 0) {
//        calculateStrategy = new AddCalculate();
//    } else if (type == 1) {
//        calculateStrategy = new SubtractCalculate();
//    } else {
//        throw new IllegalArgumentException();
//    }
//        return calculateStrategy.calculate(money, number);

}
