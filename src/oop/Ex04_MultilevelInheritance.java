package oop;

class Person {
    String name = "Sam";
    void displayName() { System.out.println("Name: " + name); }
}

class Student extends Person {
    int semester = 5;
    void displaySemester() { System.out.println("Semester: " + semester); }
}

class GraduateStudent extends Student {
    String project = "AI System";
    void displayProject() { System.out.println("Project: " + project); }
}

public class Ex04_MultilevelInheritance {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent();
        g.displayName();
        g.displaySemester();
        g.displayProject();
    }
}