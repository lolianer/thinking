package com.lolian.exec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author shen_wzhong
 * @create 2023-08-30 20:45
 */
public class Exec10_1 {
    public static void main1(String[] args) {
        for (int i = 1000; i < 9999; i++) {
            char[] s = String.valueOf(i).toCharArray();
            for (int j = 0; j < s.length; j++) {
                for (int k = 0; k < s.length; k++) {
                    for (int l = 0; l < s.length; l++) {
                        if (j == k || j == l || k == l) {
                            continue;
                        }

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 100; i++) {
            for (int j = 10; j <= 100; j++) {
                int k = i * j;
                char[] s1 = String.valueOf(i).toCharArray();
                char[] s2 = String.valueOf(j).toCharArray();
                List<Character> list = new ArrayList<>();
                for (char c : s1) {
                    list.add(c);
                }
                for (char c : s2) {
                    list.add(c);
                }
                HashSet set = new HashSet(list);
                //把List集合所有元素清空
                list.clear();
                //把HashSet对象添加至List集合
                list.addAll(set);
                if (list.size() < 4) {
                    continue;
                }
                char[] s3 = String.valueOf(k).toCharArray();
                List<Character> list1 = new ArrayList<>();
                for (char c : s3) {
                    list1.add(c);
                }
                if (list1.containsAll(list)) {
                    System.out.println(k + " = " + i + " * " + j);
                }
            }
        }
    }
}
