package com.hwj.demo.algorithm;

import java.util.Arrays;

/**
 * @Auther: heweijian
 * @Date: 2020/3/5
 * @Description:
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1000,1, 77, 43, 2, 98, 123, 8, 6,0,9000};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    //快速排序思路，挖坑填充法+分而治之+递归
    public static void quickSort(int[] arr, int min, int max) {
        int i = min, j = max, temp = arr[i];
        //区间交换
        while (i != j) {
            while (i != j && arr[j] >= temp) {//添加往下
                j--;
            }
            if (i != j) {
                arr[i] = arr[j];
            }
            while (i != j && arr[i] <= temp) {
                i++;
            }
            if (i != j) {
                arr[j] = arr[i];
            }
        }
        arr[i] = temp;//填充过程知道i=j
        if (i > min) {
            quickSort(arr, min, i - 1);
        }
        if (i + 1 < max) {
            quickSort(arr, i + 1, max);
        }

    }
}
