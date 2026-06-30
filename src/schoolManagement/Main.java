package schoolManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Department dept = new Department();
        Library lib = new Library();

        int choice;

        do {
            System.out.println("\n===== College Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Book");
            System.out.println("4. Display All");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String cname = sc.nextLine();

                    Student s = new Student(id, name, roll, new Course(cname));

                    // Inputs
                    System.out.print("Enter Fee: ");
                    double fee = sc.nextDouble();
                    s.payFee(fee, new OnlinePayment());

                    System.out.print("Total Classes: ");
                    int total = sc.nextInt();

                    System.out.print("Attended Classes: ");
                    int attended = sc.nextInt();
                    s.markAttendance(total, attended);

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    s.takeExam(marks);

                    sc.nextLine();
                    System.out.print("Enter Hostel Name: ");
                    String hostel = sc.nextLine();
                    s.assignHostel(new Hostel(hostel));

                    dept.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String tname = sc.nextLine();

                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();

                    dept.addTeacher(new Teacher(tid, tname, subject));
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    String book = sc.nextLine();
                    lib.addBook(book);
                    break;

                case 4:
                    dept.display();
                    lib.displayBooks();
                    break;

                case 5:
                    System.out.println("Exit Done");
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}