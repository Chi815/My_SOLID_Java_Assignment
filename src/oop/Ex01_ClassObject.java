package oop;

public class Ex01_ClassObject {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Ex01_ClassObject s1 = new Ex01_ClassObject();
        s1.name = "Sam";
        s1.rollNo = 101;
        s1.display();
    }
}