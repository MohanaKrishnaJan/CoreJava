import java.util.Arrays;
import java.util.stream.Stream;

public class StringCapitalization {
    public static void stringCapitalization(String[] strings) {
        Stream<String> capitalizedStream = Arrays.stream(strings)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .sorted();

        capitalizedStream.forEach(System.out::println);
    }
}
