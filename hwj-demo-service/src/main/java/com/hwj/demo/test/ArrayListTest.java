package com.hwj.demo.test;

import java.util.*;

/**
 * @Auther: heweijian
 * @Date: 2020/1/3
 * @Description:
 */
public class ArrayListTest {


    public synchronized void arrayOperator() {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        ArrayList<Integer> integers1 = new ArrayList<>(integers);
        System.out.println(integers1);
//        integers.removeIf(iterator -> iterator.equals(2));,predicate,逻辑运算符
        Iterator<Integer> iterator = integers1.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(2)) {
                iterator.remove();
            }
        }
        System.out.println(integers1);
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(1);
        numList.add(100);
        System.out.println(numList);
        Collections.sort(numList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(numList);
        ArrayListTest arrayListTest = new ArrayListTest();
        arrayListTest.arrayOperator();
    }


    //-1 o1放到o2前面 1 o1放到o2后面
}
