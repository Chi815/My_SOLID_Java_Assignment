package schoolManagement;
class Student extends Person {

    private int rollNo;
    private Course course;
    private Fee fee = new Fee();
    private Attendance attendance = new Attendance();
    private Account account = new Account();
    private Exam exam;
    private Hostel hostel;

    public Student(int id, String name, int rollNo, Course course) {
        super(id, name);
        this.rollNo = rollNo;
        this.course = course;
    }
    public void payFee(double amount, Payment payment) {
        payment.makePayment(amount);
        fee.payFee(amount);
        account.deposit(amount);
    }

    public void markAttendance(int total, int attended) {
        attendance.setAttendance(total, attended);
    }

    public void takeExam(int marks) {
        exam = new Exam(marks);
    }

    public void assignHostel(Hostel h) {
        this.hostel = h;
    }

    public void display() {
        displayBasicInfo();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Fee Status: " + fee.getStatus());
        System.out.println("Attendance: " + attendance.calculate() + "%");

        if (exam != null) {
            System.out.println("Marks: " + exam.getMarks());
            System.out.println("Result: " + exam.getResult());
        }

        if (hostel != null) {
            hostel.display();
        }

        System.out.println("Account Balance: " + account.getBalance());
    }
}
