package schoolManagement;
class Hostel {
    private String hostelName;

    public Hostel(String name) {
        this.hostelName = name;
    }

    public void display() {
        System.out.println("Hostel: " + hostelName);
    }
}
