package elearningManagement.model;

/**
 * OOP Concept: Inheritance (extends Person)
 */
public class Instructor extends Person {
    private String specialization;

    public Instructor(int id, String name, String email, String specialization) {
        super(id, name, email);
        this.specialization = specialization;
    }

    @Override
    public void displayProfile() {
        System.out.println("Instructor Profile | ID: " + id + " | Expert: " + name + " | Specialization: " + specialization);
    }
}