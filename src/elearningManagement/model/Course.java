package elearningManagement.model;

/**
 * SOLID Principle: Single Responsibility Principle (SRP)
 * Deals exclusively with Course metadata configuration structures.
 * UML Relationship: Aggregation with Instructor, Composition with Quiz.
 */
public class Course {
    private int courseId;
    private String title;
    private double price;
    private Instructor instructor; // Aggregation: Instructor exists without the Course
    private Quiz courseQuiz;       // Composition: Quiz is owned entirely by the Course

    public Course(int courseId, String title, double price, Instructor instructor, String quizQuestion, String quizAnswer) {
        this.courseId = courseId;
        this.title = title;
        this.price = price;
        this.instructor = instructor;
        this.courseQuiz = new Quiz(quizQuestion, quizAnswer);
    }

    public int getCourseId() { return courseId; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public Instructor getInstructor() { return instructor; }
    public Quiz getCourseQuiz() { return courseQuiz; }
}