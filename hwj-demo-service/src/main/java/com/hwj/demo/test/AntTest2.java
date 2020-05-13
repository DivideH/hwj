package com.hwj.demo.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: heweijian
 * @Date: 2020/1/2
 * @Description:
 */
public class AntTest2 {

    public static void main(String[] args) {
        AntTest2 antTest2 = new AntTest2();
        try {
            antTest2.testDemo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDemo() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        //反射获取信息
        AntTest antTest = new AntTest();
        Class<AntTest> antTestClass = AntTest.class;
        Method antTest1 = antTestClass.getMethod("antTest", null);
//        DemoAnt annotation = antTest1.getAnnotation(DemoAnt.class);
//        System.out.println(annotation.age());
    }

//    Class<AntTest> antTestClass = AntTest.class;
//    Method say = antTestClass.getDeclaredMethod("say", String.class, Integer.class);
//    Class<?> returnType = say.getReturnType();
//    //调用那个类的类方法
//        say.setAccessible(true);
//        say.invoke(antTest,"hello",123);
////        System.out.println(antTest.testSay);
////        antTest.testSay="abc";
//        System.out.println(antTest.getTestSay());
//    Field testSay = antTestClass.getDeclaredField("testSay");
//        testSay.setAccessible(true);
//        testSay.set(antTest,"world");
//        System.out.println(antTest.getTestSay());
}
