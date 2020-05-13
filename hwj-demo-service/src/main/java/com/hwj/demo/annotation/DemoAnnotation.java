package com.hwj.demo.annotation;

import com.hwj.demo.genricT.Generic;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;

import java.lang.annotation.*;

/**
 * @Auther: heweijian
 * @Date: 2020/3/1
 * @Description:
 */
//注解：通过标注来添加额外信息
//元注解
//公共api，放在javadoc文档中
@Documented
//类继承改注解
@Inherited
//目标范围，type包括接口，类，注解
@Target({ElementType.METHOD,ElementType.TYPE})
//运行级别，属性类型可以是enum码表，source：源文件开发者看，class：编译文件中，不进入vm加载，runtime：运行时候，有该注解，运行时候通过反射找到改注解执行具体逻辑
//反射再运行得时候解析到jvm中所以会满
@Retention(RetentionPolicy.RUNTIME)
public @interface DemoAnnotation {

    //没有默认值就是必填
    //注解中属性的数据类型
    //primitive type ，String ，Class，enum，annotation，他们的数组
    int[] value() default {1,2};
}
