package com.lolian.exec;

/**
 * 练习1: (2) 创建一个类，它包含一个int和一个char域，它们都没有被初始化，将它们的值打印出来，以验证Java执行了默认初始化
 * @author shen_wzhong
 * @create 2023-08-09 20:58
 */
public class Exec1 {
    int a;
    Character b;
    public static void main(String[] args) {
        Exec1 e = new Exec1();
        System.out.println("a的值为：" + e.a);
        System.out.println("b的值为：" + e.b.charValue());
    }
}