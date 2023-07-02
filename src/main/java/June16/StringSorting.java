import java.util.Arrays;
import java.util.Comparator;

public class StringSorting {
    public static void stringSorting(String[] strings) {

        Arrays.sort(strings, Comparator.comparingInt(String::length)
                .thenComparing((a, b) -> b.charAt(a.length() - 1) - a.charAt(a.length() - 1)));

        Arrays.stream(strings).forEach(System.out::println);
    }
}
