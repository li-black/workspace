package com.itheima;

//定义add方法求两个数的和并调用
public class MethodDemo03 {
    public static void main(String[] args) {
        int num = add(10, 20);
        System.out.println(num);
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}
