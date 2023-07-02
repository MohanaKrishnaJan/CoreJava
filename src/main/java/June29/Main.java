package June29;

import java.util.Optional;
import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {
            String[] str = {"Hello, World!", "",null};

            for(String s: str){
            Optional<Integer> length = StringOptional.getStringLength(s);
            if (length.isPresent()) {
                System.out.println("Length of the string: " + length.get());
            }
            else {
                System.out.println("The input string is null.");
            }
            }

            for(String s: str){
                if(s==null)
                    continue;
                Optional<String> inputOptional = Optional.of(s);
                Optional<String> outputOptional = StringOptional.convertToUpperCase(inputOptional);

                if (outputOptional.isPresent()) {
                    System.out.println("Uppercase string: " + outputOptional.get());
                } else {
                    System.out.println("The input is empty.");
                }
            }
        int age = AgeJava8.calculateAge(1998, 12, 31);
        System.out.println("Age: " + age);

        List<LocalDate> dates = List.of(
                LocalDate.of(2022, 1, 15),
                LocalDate.of(2022, 2, 10),
                LocalDate.of(2022, 3, 5),
                LocalDate.of(2022, 4, 20),
                LocalDate.of(2022, 5, 30)
        );

        EarliestDatesJava8.findEarliestAndLatestDates(dates);

        LocalDate startDate = LocalDate.of(2023, 6, 15);
        int workingDays = WorkingDaysJava8.calculateWorkingDaysUntilEndOfMonth(startDate);
        System.out.println("Number of working days until the end of the month: " + workingDays);

    }
}
