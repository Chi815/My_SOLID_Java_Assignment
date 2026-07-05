package elearningManagement.service;

import elearningManagement.model.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Clean Code Practice: High Cohesion.
 * Service module organizing state lookups cleanly across independent maps.
 * UML Relationship: Aggregation of Students, Instructors, and Courses.
 */
public class ELearningPlatform {
    private Map<Integer, Student> students = new HashMap<>();
    private Map<Integer, Instructor> instructors = new HashMap<>();
    private Map<Integer, Course> courses = new HashMap<>();

    public void registerStudent(Student student) {
        students.put(student.getId(), student);
        System.out.println("Student registered: " + student.getName());
    }

    public void registerInstructor(Instructor instructor) {
        instructors.put(instructor.getId(), instructor);
        System.out.println("Instructor registered: " + instructor.getName());
    }

    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
        System.out.println("Course published: " + course.getTitle());
    }

    public Student getStudent(int id) { return students.get(id); }
    public Instructor getInstructor(int id) { return instructors.get(id); }
    public Course getCourse(int id) { return courses.get(id); }

    public void displayDashboard() {
        System.out.println("\n--- SYSTEM REGISTRY DASHBOARD ---");
        System.out.println("Instructors:");
        instructors.values().forEach(Instructor::displayProfile);
        
        System.out.println("\nCourses Available:");
        courses.values().forEach(c -> System.out.println("ID: " + c.getCourseId() + " | " + c.getTitle() + " | Price: $" + c.getPrice() + " | Instructor: " + c.getInstructor().getName()));
        
        System.out.println("\nStudents & Progress:");
        students.values().forEach(s -> {
            s.displayProfile();
            for (Enrollment e : s.getEnrollments()) {
                System.out.println("  -> Course: " + e.getCourse().getTitle() + " | Paid: " + e.isPaid() + " | Complete: " + e.getProgress().getCompletionPercentage() + "% | Passed: " + e.getProgress().isQuizPassed());
            }
        });
    }
}