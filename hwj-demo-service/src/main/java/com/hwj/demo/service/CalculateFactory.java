package com.hwj.demo.service;

import com.hwj.demo.service.impl.AddCalculate;
import com.hwj.demo.service.impl.SubtractCalculate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Auther: heweijian
 * @Date: 2019/12/30
 * @Description:
 */
public class CalculateFactory {

    //通过map直接get
    private Map<Integer, CalculateStrategy> calculateStrategyMap;


    private CalculateFactory() {
        List<CalculateStrategy> calculateStrategies = Arrays.asList(new AddCalculate(), new SubtractCalculate());
        this.calculateStrategyMap = calculateStrategies.stream().collect(Collectors.toMap(CalculateStrategy::getType, calculateStrategy -> calculateStrategy));
    }

    private static class CalculateFactorySingletonHolder {
        private static CalculateFactory calculateFactoryInstance = new CalculateFactory();
    }

    static CalculateFactory getInstance() {
        return CalculateFactorySingletonHolder.calculateFactoryInstance;
    }

    public CalculateStrategy getCalculateStrategy(Integer type){
        return calculateStrategyMap.get(type);
    }
}
