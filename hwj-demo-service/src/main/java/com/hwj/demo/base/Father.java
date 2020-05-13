package com.hwj.demo.base;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Auther: heweijian
 * @Date: 2020/1/16
 * @Description:
 */
public class Father {

    private Integer testNum;

    public Father(Integer testNum) {
        this.testNum = testNum;
    }

    public String say(String s) {
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Father father = (Father) o;
        return Objects.equals(testNum, father.testNum);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(testNum);
//    }
}
