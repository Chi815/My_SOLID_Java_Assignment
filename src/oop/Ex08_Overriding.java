package oop;

class BasePerson {
    protected String name = "Sam";
}

class OverridingStudent extends BasePerson {
    void display() { System.out.println("Student Name: " + name); }
}

public class Ex08_Overriding {
    public static void main(String[] args) {
        OverridingStudent s = new OverridingStudent();
        s.display();
    }
}