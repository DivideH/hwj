package com.hwj.demo.lambda;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import springfox.documentation.spring.web.json.Json;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Auther: heweijian
 * @Date: 2020/3/3
 * @Description:
 */
public class lambdaService {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        IntStream intStream = IntStream.rangeClosed(1, 100).filter(value -> value % 2 == 0);
//        int sum = intStream.sum();
        lambdaService lambdaService = new lambdaService();
        lambdaService.map2List();
    }

    public void futureTask() throws ExecutionException, InterruptedException {
        StringBuffer stringBuffer = new StringBuffer();
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return null;
            }
        };
        FutureTask<Integer> integerFutureTask = new FutureTask<>(callable);
        new Thread(integerFutureTask).start();
        //阻塞
        Integer integer = integerFutureTask.get();
    }

    public void map2List() {
        List<Apple> apples = Lists.newArrayList(new Apple(1, 1),
                new Apple(2, 1));
        //get()源码返回null，返回固定值
//        Map<Integer, Apple> collect = Optional.of(apples).orElse(Collections.emptyList()).stream().collect(Collectors.toMap(Apple::getId, apple -> apple));
//        System.out.println(JSON.toJSON(collect));
        //去重返回一个
        Map<Integer, Apple> collect1 = Optional.of(apples).orElse(Collections.emptyList()).stream().collect(Collectors.toMap(Apple::getId, apple -> apple,(Apple v1,Apple v2)->v2));

        //按照id分组，collect中collectors收集器中的groupingBy中参数重写--》函数式参数
        Map<Integer, List<Apple>> collect = Optional.of(apples).orElse(Collections.emptyList()).stream().collect(Collectors.groupingBy(Apple::getId));
    }

    public void map2List2() {
        List<String> apples = Lists.newArrayList("1,2","1,3");
        //去重，实现binaryOperator,apple(命名，参数类型已经胜率，list中的T泛型)
        Optional.of(apples).orElse(Collections.emptyList()).stream().map(apple -> apple.split(",")).collect(Collectors.toMap(apple->apple[0],apple->Lists.newArrayList(apple[1]),(List<String> appleStr1,List<String> appleStr2)->{
            appleStr1.addAll(appleStr2);
            return appleStr1;
        }));

    }

    private class Apple {
        private Integer number;

        private Integer id;

        public Apple(Integer number, Integer id) {
            this.number = number;
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }
    }

}
