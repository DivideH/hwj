package com.hwj.demo.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: heweijian
 * @Date: 2020/1/2
 * @Description:
 */
public class AntTest {

    private int retention;

    private String target;

    private String testSay = "hello";

    //给方法配置信息
    public void antTest() {

    }

    public int getRetention() {
        return retention;
    }

    public void setRetention(int retention) {
        this.retention = retention;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    private Integer say(String name, Integer age) {
        System.out.println(name + age);
        return 1;
    }

    //获取ant信息
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //反射获取信息
        Class<AntTest> antTestClass = AntTest.class;
        //通过反射设置值的对象
        AntTest antTest = new AntTest();
        if (antTestClass.equals(antTest.getClass())){
            System.out.println("同个类型类对象，和对象的类对象，指向同一个内存块地址");
        }
        Method say = antTestClass.getDeclaredMethod("say", String.class, Integer.class);
        //调用那个类的类方法
        say.setAccessible(true);
        say.invoke(antTest, "hello", 123);
    }

    public String getTestSay() {
        return testSay;
    }

    public void setTestSay(String testSay) {
        this.testSay = testSay;
    }

    /*        Method antTest = antTestClass.getMethod("antTest", Method.class);
        DemoAnt annotation = antTest.getAnnotation(DemoAnt.class);
        System.out.println(annotation.age());*/

//      System.out.println(antTestClass.getTypeName());
//    Field[] fields = antTestClass.getFields();
//    Field[] declaredFields = antTestClass.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//        System.out.println(declaredField.getName());
//        System.out.println(declaredField.getModifiers());
//        System.out.println(declaredField.getType());
//    }
//    Method[] methods = antTestClass.getDeclaredMethods();
//        for (Method method : methods) {
//        System.out.println(method.getReturnType());
//        Class<?> returnType = method.getReturnType();
//        Parameter[] parameters = method.getParameters();
//        for (Parameter parameter : parameters) {
//            System.out.println(parameter.getParameterizedType());
//        }
//    }
}
