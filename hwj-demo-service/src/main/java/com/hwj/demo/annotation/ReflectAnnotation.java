package com.hwj.demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Auther: heweijian
 * @Date: 2020/3/1
 * @Description:
 */
public class ReflectAnnotation {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("获取方法上的注解信息");
        Class<ReflectAnnotation> reflectAnnotationClass = ReflectAnnotation.class;
        //getAnnotation 类中是否有@interface
//        DemoAnnotation annotation = reflectAnnotationClass.getAnnotation(DemoAnnotation.class);
        Method testAnnotation = reflectAnnotationClass.getMethod("testAnnotation", null);
        DemoAnnotation annotation = testAnnotation.getAnnotation(DemoAnnotation.class);
        Class<? extends Annotation> aClass = annotation.annotationType();
        System.out.println(aClass);
        int[] value = annotation.value();
    }

    @DemoAnnotation(value = {6,6})
    public void testAnnotation(){
        System.out.println("方法上添加注解");
    }

}
