package com.lolian.exam;

/**
 * @author shen_wzhong
 * @create 2023-08-08 20:58
 */
public class exam1 {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}