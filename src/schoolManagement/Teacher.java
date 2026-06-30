package schoolManagement;

class Teacher extends Person {
    private String subject;

    public Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    public void display() {
        displayBasicInfo();
        System.out.println("Subject: " + subject);
    }
}
