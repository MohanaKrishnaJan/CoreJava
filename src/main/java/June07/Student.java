package June07;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Double gpa;

    public Student(String firstName, String lastName, Double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
    }
}
