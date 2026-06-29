package oop;

abstract class AbstractPerson {
    abstract void work(); 
}

class AbstractStudent extends AbstractPerson {
    void work() { System.out.println("Student studies"); }
}

class AbstractTeacher extends AbstractPerson {
    void work() { System.out.println("Teacher teaches"); }
}

public class Ex09_Abstraction {
    public static void main(String[] args) {
        AbstractPerson p1 = new AbstractStudent();
        AbstractPerson p2 = new AbstractTeacher();
        p1.work();
        p2.work();
    }
}