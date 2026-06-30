package schoolManagement;
class Exam {
    private int marks;
    
    public Exam(int marks){
        this.marks = marks;
    }

    public String getResult(){
        return(marks>= 40)? "Pass":"Fail";
    }

    public int getMarks(){
        return marks;
    }
}
