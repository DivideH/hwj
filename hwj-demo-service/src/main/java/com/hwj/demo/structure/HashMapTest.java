package com.hwj.demo.structure;

import com.hwj.demo.base.Father;
import com.hwj.demo.base.Sun;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: heweijian
 * @Date: 2020/2/24
 * @Description:
 */
public class HashMapTest {

    public static void main(String[] args) {
        Father father = new Father(1);
        Father father1 = new Father(1);
        Set<Father> set=new HashSet<>();
        set.add(father);
        set.add(father1);
        System.out.println(set);

    }
}
