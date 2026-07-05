package elearningManagement;

import elearningManagement.model.*;
import elearningManagement.payment.*;
import elearningManagement.service.*;

/**
 * Automated Test Runner for the E-Learning Management System.
 * This file bypasses the UI layer to simulate a complete system integration test.
 */
public class PlatformTest {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       STARTING SYSTEM INTEGRATION TEST           ");
        System.out.println("==================================================");

        // 1. Initialize our Core System Engine
        ELearningPlatform platform = new ELearningPlatform();

        // 2. Test Instructor Registration
        System.out.println("\n[TEST 1] Registering Instructor...");
        Instructor instructor = new Instructor(201, "Prof. Grace Hopper", "grace@platform.edu", "Compiler Design");
        platform.registerInstructor(instructor);

        // 3. Test Course and Quiz Creation (Composition)
        System.out.println("\n[TEST 2] Publishing Course with integrated Evaluation Quiz...");
        Course oopCourse = new Course(901, "Advanced Software Engineering", 150.00, instructor, 
                                      "What does DIP stand for?", "Dependency Inversion Principle");
        platform.addCourse(oopCourse);

        // 4. Test Student Registration
        System.out.println("\n[TEST 3] Registering Student...");
        Student student = new Student(1001, "Ada Lovelace", "ada@lovelace.io");
        platform.registerStudent(student);

        // 5. Test Course Enrollment (Association)
        System.out.println("\n[TEST 4] Creating Course Enrollment...");
        Enrollment enrollment = new Enrollment(oopCourse);
        student.addEnrollment(enrollment);
        System.out.println("Enrollment linkage completed successfully.");

        // 6. Test Polymorphic Payments (SOLID: DIP / OCP)
        System.out.println("\n[TEST 5] Processing Pluggable Payments...");
        
        System.out.println("-> Trying Insufficient Payment via Credit Card:");
        enrollment.processTuition(50.00, new CardPayment()); // Should fail
        System.out.println("Current Enrollment Paid Status: " + enrollment.isPaid());

        System.out.println("\n-> Trying Full Payment via Cash/Voucher Desk:");
        enrollment.processTuition(150.00, new CashPayment()); // Should succeed
        System.out.println("Current Enrollment Paid Status: " + enrollment.isPaid());

        // 7. Test Quiz Evaluation & Certificate Generation Workflow
        System.out.println("\n[TEST 6] Simulating Course Quiz & Certificate Issuance...");
        Quiz courseQuiz = oopCourse.getCourseQuiz();
        
        String simulatedAnswer = "Dependency Inversion Principle";
        System.out.println("Simulating Student Answer: '" + simulatedAnswer + "'");
        
        if (courseQuiz.verifyAnswer(simulatedAnswer)) {
            System.out.println("SUCCESS: Quiz Answer Verified!");
            enrollment.getProgress().completeQuiz();
            
            // Generate and display the certificate document automatically
            Certificate certificate = new Certificate(student, oopCourse);
            certificate.issueCertificate();
        } else {
            System.out.println("FAILURE: Quiz Answer was incorrect.");
        }

        // 8. Test Global System State Reporting
        System.out.println("\n[TEST 7] Printing Platform Analytics Dashboard...");
        platform.displayDashboard();

        System.out.println("\n==================================================");
        System.out.println("       INTEGRATION TEST RUN COMPLETED SUCCESSFULLY ");
        System.out.println("==================================================");
    }
}