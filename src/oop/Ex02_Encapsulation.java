package oop;

class EncapsulatedStudent {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class Ex02_Encapsulation {
    public static void main(String[] args) {
        EncapsulatedStudent s = new EncapsulatedStudent();
        s.setMarks(85);
        System.out.println("Marks: " + s.getMarks());
    }
}