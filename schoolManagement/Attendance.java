package schoolManagement;
/**
 * Attendance
 */
 class Attendance {
    private int total;
    private int attended;

    public void setAttendance(int total, int attended){
        this.total= total;
        this.attended = attended;
    }

    public double calculate(){
        return(total ==0)? 0: (attended*100.00)/total;
    }

}