package com.hwj.demo.shortcut;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @Auther: heweijian
 * @Date: 2020/1/3
 * @Description:
 */
public class IdeaShortcut {

    public String test(String obj) {
        //.cast,.return ,.if .null,nn ,.var定义变量
        if (obj == null) {

        }
        if (obj != null) {

        }
        if (obj.equals("abc")) {

        }
        String obj1 = obj;
        int i = 123;
        String java = "java";
        return "string";
    }

    public void validCollectionEmty(){
        List<Object> objects = new ArrayList<>();
        List<Object> objects1 = Optional.ofNullable(objects).orElse(Collections.emptyList());
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Date date = new Date();
        Class<? extends Date> aClass = date.getClass();
        Class<Date> dateClass = Date.class;
        if (aClass.equals(dateClass)){
            System.out.println("class文件的class对象地址都是一样");
        }
        Method after = dateClass.getMethod("after", Date.class);
        Method after1 = aClass.getMethod("after", Date.class);
        if (after.equals(after1)){
            System.out.println(1);
        }

//        for (Method method : dateClass.getMethods()) {
//            System.out.println(method.getName());
//            Class<?>[] parameterTypes = method.getParameterTypes();
//            for (Class<?> parameterType : parameterTypes) {
//                System.out.println(parameterType.getTypeName());
//            }
//            return ;
//        }
    }
}
