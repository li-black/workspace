package com.itheima;

//找出并打印数组arr的最大值和最小值
public class TestDemo04 {
    public static void main(String[] args) {
        int[] arr = {15, 85, 416, 1662, 1385, 223, 5235, 135354};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
