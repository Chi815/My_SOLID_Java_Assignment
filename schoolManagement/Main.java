package schoolManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int choice;
        do{
            System.out.println("\n ======= College Management System ======");
            System.out.println("1.Add Student");
            System.out.println("2.Add teacher");
            System.out.println("3. Add Book");
            System.out.println("4. Display All");
            System.out.println("5. Exit");
            System.out.println("Enter choice:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name:");
                    String Name = sc.nextLine();

                    System.out.println("Enter Roll No:");
                    int Roll =sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Course:");
                    String cname = sc.nextLine();

                    Student s = new Student(id, Name, Roll);

                    break;

                    

                case 2:
                    System.out.println("Exit Done");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
    
}
