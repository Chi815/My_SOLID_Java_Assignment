package elearningManagement;

import elearningManagement.model.*;
import elearningManagement.payment.*;
import elearningManagement.service.*;
import java.util.Scanner;

/**
 * Clean Code Principle: Clear Separation of Concerns.
 * Main acts strictly as the Presentation Layer / User Interface controller.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ELearningPlatform platform = new ELearningPlatform();

        // Seed initial data for testing demonstration
        Instructor defaultInstructor = new Instructor(101, "Dr. Alan Turing", "turing@platform.edu", "Computer Science");
        platform.registerInstructor(defaultInstructor);
        platform.addCourse(new Course(501, "Java OOP & SOLID Design", 99.99, defaultInstructor, "What does SRP stand for?", "Single Responsibility Principle"));

        int choice;
        do {
            System.out.println("\n========== E-LEARNING MANAGEMENT SYSTEM ==========");
            System.out.println("1. Register Student");
            System.out.println("2. Register Instructor");
            System.out.println("3. Create & Publish Course");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Process Course Fee Payment");
            System.out.println("6. Take Course Evaluation Quiz");
            System.out.println("7. View Platform Registry Dashboard");
            System.out.println("8. Exit Application");
            System.out.print("Select choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid format. Enter a valid integer: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String sname = scanner.nextLine();
                    System.out.print("Enter Student Email: ");
                    String semail = scanner.nextLine();
                    platform.registerStudent(new Student(sid, sname, semail));
                    break;

                case 2:
                    System.out.print("Enter Instructor ID: ");
                    int iid = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Enter Instructor Name: ");
                    String iname = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String iemail = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String spec = scanner.nextLine();
                    platform.registerInstructor(new Instructor(iid, iname, iemail, spec));
                    break;

                case 3:
                    System.out.print("Enter Course ID: ");
                    int cid = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Enter Course Title: ");
                    String ctitle = scanner.nextLine();
                    System.out.print("Enter Course Price: ");
                    double cprice = scanner.nextDouble(); scanner.nextLine();
                    System.out.print("Enter Instructor ID: ");
                    int assignIid = scanner.nextInt(); scanner.nextLine();
                    
                    Instructor inst = platform.getInstructor(assignIid);
                    if (inst != null) {
                        System.out.print("Enter Quiz Question: ");
                        String qText = scanner.nextLine();
                        System.out.print("Enter Quiz Answer Key: ");
                        String qAns = scanner.nextLine();
                        platform.addCourse(new Course(cid, ctitle, cprice, inst, qText, qAns));
                    } else {
                        System.out.println("Error: Instructor record missing!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int esid = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    int ecid = scanner.nextInt();
                    
                    Student stud = platform.getStudent(esid);
                    Course cour = platform.getCourse(ecid);
                    if (stud != null && cour != null) {
                        stud.addEnrollment(new Enrollment(cour));
                        System.out.println("Student successfully registered to the enrollment ledger.");
                    } else {
                        System.out.println("Error: Mismatched Student or Course IDs.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int psid = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    int pcid = scanner.nextInt();
                    
                    Student pStud = platform.getStudent(psid);
                    if (pStud != null) {
                        Enrollment targetEnrollment = null;
                        for (Enrollment e : pStud.getEnrollments()) {
                            if (e.getCourse().getCourseId() == pcid) {
                                targetEnrollment = e;
                                break;
                            }
                        }
                        if (targetEnrollment != null) {
                            System.out.println("Select Payment Mode (1: Online NetBanking, 2: Credit Card, 3: Cash/Voucher): ");
                            int mode = scanner.nextInt();
                            Payment processEngine;
                            if (mode == 2) processEngine = new CardPayment();
                            else if (mode == 3) processEngine = new CashPayment();
                            else processEngine = new OnlinePayment();
                            
                            targetEnrollment.processTuition(targetEnrollment.getCourse().getPrice(), processEngine);
                        } else {
                            System.out.println("Error: Student has no matching enrollment record.");
                        }
                    } else {
                        System.out.println("Error: Student record missing.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Student ID: ");
                    int qsid = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    int qcid = scanner.nextInt(); scanner.nextLine();
                    
                    Student qStud = platform.getStudent(qsid);
                    if (qStud != null) {
                        Enrollment targetEnroll = null;
                        for (Enrollment e : qStud.getEnrollments()) {
                            if (e.getCourse().getCourseId() == qcid) { targetEnroll = e; break; }
                        }
                        if (targetEnroll != null && targetEnroll.isPaid()) {
                            Quiz activeQuiz = targetEnroll.getCourse().getCourseQuiz();
                            System.out.println("Exam Question: " + activeQuiz.getQuestion());
                            System.out.print("Your Answer: ");
                            String userAns = scanner.nextLine();
                            if (activeQuiz.verifyAnswer(userAns)) {
                                System.out.println("Passed! Correct Answer.");
                                targetEnroll.getProgress().completeQuiz();
                                
                                // Generate Certificate upon completion
                                Certificate cert = new Certificate(qStud, targetEnroll.getCourse());
                                cert.issueCertificate();
                            } else {
                                System.out.println("Failed! Incorrect evaluation response.");
                            }
                        } else {
                            System.out.println("Access Denied: Pay the balance or enroll first.");
                        }
                    }
                    break;

                case 7:
                    platform.displayDashboard();
                    break;

                case 8:
                    System.out.println("Exiting System.");
                    break;
                default:
                    System.out.println("Invalid selection option.");
            }
        } while (choice != 8);
        scanner.close();
    }
}