import java.util.stream.Stream;

public class StringsWithVowels {
    public static void stringsWithVowels(String[] strings) {

        Stream.of(strings)
                .filter(str -> str.matches(".*[aeiou].*"))
                .forEach(str -> System.out.println(str + " - " + countVowels(str)));
    }

    private static int countVowels(String str) {
        return (int) str.chars()
                .mapToObj(Character::toLowerCase)
                .filter(ch -> "aeiou".contains(Character.toString(ch)))
                .count();
    }
}
