package June19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveLessThanAvgStudents {
    public static void removeLessThanAvgStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aishwarya", " Shivakumar", 3.6));
        students.add(new Student("Deepika", "Shivaraman", 3.2));
        students.add(new Student("Madhav", "Vishnuprasad", 3.9));
        students.add(new Student("Surya", "Shivasharma", 2.8));
        students.add(new Student("Vishnuvarman", "Menon", 3.7));

        double sum = 0;
        for (Student student : students) {
            sum += student.getGpa();
        }

        double average = sum / students.size();

        System.out.println("\nAll students\n" + students);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGpa() < average) {
                iterator.remove();
            }
        }
        System.out.println("Student with above Average GPA\n");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
