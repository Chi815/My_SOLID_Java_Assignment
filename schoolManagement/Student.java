package schoolManagement;
class Student extends Person {
    private int rollno;

    public Student(int id, String name, int rollno){
        super(id, name);
        this.rollno = rollno;
    }

    public void display(){
        displayBasicInfo();
        System.out.println("Roll no:"+ rollno);
    }
    
}
