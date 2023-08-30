package com.lolian.exec;

/**练习10:(5) 吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，而这对数字各包含乘积的一半位数的数字，
 * 其中从最初的数字中选取的数字可以任意排序。以两个0结尾的数字是不允许的，例如，
 1260 = 21 * 60
 1827 = 21 * 87
 2187 = 27 * 81
 写一个程序，找出4位数的所有吸血鬼数字 (DanForhan推荐)。
 * @author shen_wzhong
 *  2023-08-17 21:15
 */
public class Exec10 {

    /**
     * 写一个程序，找出4位数的所有吸血鬼数字
     * @param args 放入的参数
     */
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            for (int j = i; j <= 99; j++) {
                int product = i * j;
                if (product >= 1000 && product <= 9999) {
                    if (isVampire(i, j, product)) {
                        System.out.println(product + " = " + i + " * " + j);
                    }
                }
            }
        }
    }

    private static boolean isVampire(int num1, int num2, int product) {
        String numStr = num1 + "" + num2;
        char[] numChars = numStr.toCharArray();
        char[] productChars = (product + "").toCharArray();
        for (char c : numChars) {
            int index = new String(productChars).indexOf(c);
            if (index == -1) {
                return false;
            }
            productChars[index] = ' ';
        }
        return new String(productChars).trim().isEmpty();
    }
}

