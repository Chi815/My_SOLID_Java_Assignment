package schoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Student>students=new ArrayList<>();
    private List<Teacher>teachers = new ArrayList<>();

    public void addStudent(Student s){
        students.add(s);
    }

    public void addTeacher(Teacher t){
        teachers.add(t);
    }
    public void display(){
        System.out.println("\n---Students---");
        for( Student s: students){
            s.display();
            System.out.println();
        }
        System.out.println(("\n ------Teachers-----"));
        for(Teacher t:teachers){
            t.display();
            System.out.println();
        }
    }
}
