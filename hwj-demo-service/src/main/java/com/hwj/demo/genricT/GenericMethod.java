package com.hwj.demo.genricT;

import com.hwj.demo.base.Father;
import com.hwj.demo.base.Sun;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: heweijian
 * @Date: 2020/2/23
 * @Description:
 */
public class GenericMethod {
    //泛型，定义泛型类或者泛型方法
    //1.类型参数化：通用性  2.使用得时候确定类型  约束性：约束作用在编译器，在运行期都默认Object

    //3.extend super 在泛型得作用：约束性，使用公共得方法

    //通配符：？不确定类型，与泛型不一样，（泛型引用可以指向得范围）灵活性
    //常用场景：引用（方法参数）
    //注意：extend能够读--》读时用公共父类，不能写因为？不确定是哪一个类型所以不能强制转换
    //      super能读也能写，都用做object来处理


    //泛型方法：定义方法得入参或者返回值在使用时候得类型
        public <T extends Father> T method(T t) {
        return t;
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
//        System.out.println(genericMethod.method(new Father()));
//        System.out.println(genericMethod.method(new Sun()));
        List<? extends Father> list;
        list=new ArrayList<Sun>();
        Father father = list.get(0);
//        list.add(new Sun());
        List<? super Sun> list2;
        list2=new ArrayList<Father>();
//        list2.add(new Sun());
        Object object = list2.get(0);
        Integer integer = new Integer(1);
    }

}
