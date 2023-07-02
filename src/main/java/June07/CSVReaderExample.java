package June07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSVReaderExample {
    public void sortStudent(){
        String csvFile = "C:/JMKS/CIS/Java/CoreJava/src/June07/students.csv";
        String line;
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String firstName = data[0];
                String lastName = data[1];
                if(!data[2].equals("gpa")){
                    Double gpaString = Double.parseDouble(data[2]);
                    Student student = new Student(firstName, lastName,gpaString);
                    students.add(student);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(students);

        System.out.format("%15s%15s%10s\n","First Name", "Last Name","GPA");
        for (Student student : students) {
            System.out.format("%15s%15s%10s", student.getFirstName(), student.getLastName(), student.getGpa());
            System.out.println();
        }
    }
}







