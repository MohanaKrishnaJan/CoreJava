package June20;

public class StudentHashMap {
    public static String firstName;
    public String lastName;
    public double GPA;

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "StudentHashMap{" +
                "lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public StudentHashMap(String firstName,String lastName, double GPA){
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

}
