package elearningManagement.model;

/**
 * OOP Concept: Abstraction (Abstract Class)
 * SOLID Principle: Liskov Substitution Principle (LSP)
 * Base class for all users. Subclasses substitute Person flawlessly.
 */
public abstract class Person {
    protected int id;
    protected String name;
    protected String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    
    public abstract void displayProfile();
}