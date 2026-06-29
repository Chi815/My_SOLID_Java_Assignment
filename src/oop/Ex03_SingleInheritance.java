package oop;

class Teacher {
    String subject = "Java";
    void displaySubject() { System.out.println("Subject: " + subject); }
}

class HOD extends Teacher {
    String department = "Computer Science";
    void displayDept() { System.out.println("Department: " + department); }
}

public class Ex03_SingleInheritance {
    public static void main(String[] args) {
        HOD h = new HOD();
        h.displaySubject();
        h.displayDept();
    }
}