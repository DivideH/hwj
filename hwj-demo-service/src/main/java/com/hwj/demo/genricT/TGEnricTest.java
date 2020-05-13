package com.hwj.demo.genricT;

/**
 * @Auther: heweijian
 * @Date: 2020/1/16
 * @Description:
 */
public class TGEnricTest<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        TGEnricTest<Integer> tgEnricTest=new TGEnricTest<>();
        TGEnricTest<? extends Number> test=new TGEnricTest<>();
    }
}
