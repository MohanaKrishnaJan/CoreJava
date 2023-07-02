package June29;

import java.time.LocalDate;
import java.util.List;

public class EarliestDatesJava8 {
    public static void findEarliestAndLatestDates(List<LocalDate> dates) {
        LocalDate earliestDate = dates.stream()
                .min(LocalDate::compareTo)
                .orElse(null);
        LocalDate latestDate = dates.stream()
                .max(LocalDate::compareTo)
                .orElse(null);

        System.out.println("Earliest date: " + earliestDate);
        System.out.println("Latest date: " + latestDate);
    }
}
