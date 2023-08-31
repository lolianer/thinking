package com.lolian;

/** main方法所在类不是public的，也可以运行
 * @author shen_wzhong
 * @create 2023-08-31 20:15
 */
class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    /*
    此方法所在类虽然美欧public，但是也可以直接运行
     */
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
        //中文修
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();  //创建了一个子类
        x.dilute();                     //调用用了父类的方法，可以可以的，父类将方法继承到了子类中 
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
