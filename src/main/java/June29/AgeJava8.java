package June29;

import java.time.LocalDate;
import java.time.Period;

public class AgeJava8 {
    public static int calculateAge(int year, int month, int day) {
        LocalDate birthdate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        return age.getYears();
    }
}




