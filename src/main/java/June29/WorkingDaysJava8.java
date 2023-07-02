package June29;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkingDaysJava8 {
    public static int calculateWorkingDaysUntilEndOfMonth(LocalDate startDate) {
        int workingDays = 0;
        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(startDate.withDayOfMonth(startDate.lengthOfMonth()))) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            currentDate = currentDate.plusDays(1);
        }

        return workingDays;
    }
}
