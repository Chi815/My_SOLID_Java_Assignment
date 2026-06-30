package schoolManagement;
public class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayBasicInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}