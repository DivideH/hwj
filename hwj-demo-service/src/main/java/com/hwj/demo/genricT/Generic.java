package com.hwj.demo.genricT;

import com.hwj.demo.base.Father;
import com.hwj.demo.base.Sun;

/**
 * @Auther: heweijian
 * @Date: 2020/1/16
 * @Description:
 */
public class Generic<T extends Father,S> {

    private T value;

    private S value2;

    public Generic(T value, S value2) {
        System.out.println(value.say("你好"));
        this.value = value;
        this.value2 = value2;
    }

    public S getValue2() {
        return value2;
    }

    public void setValue2(S value2) {
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public <v> v say(v t) {
        return t;
    }

    public <v> Integer say1(Integer t) {
        return t;
    }

    public static void main(String[] args) {
//        Generic<Sun,Object> generic = new Generic<>(new Sun(),1);
//        Generic<Integer,Long> objectGenric = new Generic<>();
//        objectGenric.setValue(1);
//        System.out.println(objectGenric.getValue());
//        System.out.println(objectGenric.say("helloWord"));
//        System.out.println(objectGenric.say1(1));
//        System.out.println(objectGenric.<Long>say1(1));
//        System.out.println(objectGenric.<String>say("helloWord"));
//
//
//        Generic<? extends Integer, Long> objectObjectGenric = new Generic<>();
////        objectObjectGenric.setValue(1);
//
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        List<Number> lis1t=new ArrayList<>();
//        lis1t.add(1);
//
//        Generic<Object,Long> objectObjectGenric1 = new Generic<>();
//        objectObjectGenric1.setValue(1L);

    }

}
