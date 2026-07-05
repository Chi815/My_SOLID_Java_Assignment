package elearningManagement.model;

import java.util.ArrayList;
import java.util.List;

/**
 * OOP Concept: Inheritance (extends Person)
 * UML Relationship: Association with Enrollment
 */
public class Student extends Person {
    private List<Enrollment> enrollments;

    public Student(int id, String name, String email) {
        super(id, name, email);
        this.enrollments = new ArrayList<>();
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    @Override
    public void displayProfile() {
        System.out.println("Student Profile | ID: " + id + " | Name: " + name + " | Email: " + email);
        System.out.println("Enrolled Courses: " + enrollments.size());
    }
}