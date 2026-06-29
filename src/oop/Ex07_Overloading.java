package oop;

class OverloadDemo {
    void add(int a) { System.out.println(a); }
    void add(int a, int b) { System.out.println(a + b); }
}

public class Ex07_Overloading {
    public static void main(String[] args) {
        OverloadDemo d = new OverloadDemo();
        d.add(5);
        d.add(5, 10);
    }
}