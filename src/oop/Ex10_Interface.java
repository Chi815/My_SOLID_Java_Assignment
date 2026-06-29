package oop;

interface CollegeRules {
    void attendClass();
    void submitAssignment();
}

class RuleFollowingStudent implements CollegeRules {
    public void attendClass() { System.out.println("Student attends class"); }
    public void submitAssignment() { System.out.println("Student submits assignment"); }
}

public class Ex10_Interface {
    public static void main(String[] args) {
        RuleFollowingStudent s = new RuleFollowingStudent();
        s.attendClass();
        s.submitAssignment();
    }
}