package elearningManagement.model;

import java.util.Date;

/**
 * SOLID Principle: Single Responsibility Principle (SRP)
 * Handles award document printing workflows independently.
 * UML Relationship: Dependency on Student and Course.
 */
public class Certificate {
    private Student student;
    private Course course;
    private Date issueDate;

    public Certificate(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.issueDate = new Date();
    }

    public void issueCertificate() {
        System.out.println("\n==================================================");
        System.out.println("            OFFICIAL PLATFORM CERTIFICATE         ");
        System.out.println("==================================================");
        System.out.println("This certifies that: " + student.getName());
        System.out.println("Has successfully completed the curriculum for:");
        System.out.println("     \"" + course.getTitle() + "\"");
        System.out.println("Issued on: " + issueDate);
        System.out.println("Verified under Instructor: " + course.getInstructor().getName());
        System.out.println("==================================================\n");
    }
}