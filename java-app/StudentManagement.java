import java.io.FileWriter;
import java.util.ArrayList;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagement {
    public static void main(String[] args) throws Exception {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1,"Ameen",85));
        students.add(new Student(2,"Rahul",72));
        students.add(new Student(3,"Sara",91));

        FileWriter fw = new FileWriter("students.csv");
        fw.write("ID,Name,Marks\n");

        for(Student s : students){
            fw.write(s.id + "," + s.name + "," + s.marks + "\n");
        }

        fw.close();

        System.out.println("students.csv created");
    }
}
