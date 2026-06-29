package oop;

class CollegePerson {
    String college = "PCPS College";
}

class HierarchicalStudent extends CollegePerson {
    void showStudent() { System.out.println("I am a Student of " + college); }
}

class HierarchicalTeacher extends CollegePerson {
    void showTeacher() { System.out.println("I am a Teacher of " + college); }
}

public class Ex05_HierarchicalInheritance {
    public static void main(String[] args) {
        HierarchicalStudent s = new HierarchicalStudent();
        HierarchicalTeacher t = new HierarchicalTeacher();
        s.showStudent();
        t.showTeacher();
    }
}