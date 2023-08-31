package com.lolian;

/**
 * @author shen_wzhong
 * @create 2023-08-31 20:59
 */
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);    //必须显示的调用父类的构造器
        System.out.println("BoardGame constructor");
    }
}
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
