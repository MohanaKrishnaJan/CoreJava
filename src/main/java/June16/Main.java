import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[] strings1 =  {"Dragon", "Phoenix", "Unicorn", "Sphinx", "Kraken", "Centaur", "Griffin", "Minotaur"};
        System.out.println("STRING CAPITALIZATION");
        StringCapitalization.stringCapitalization(strings1);

        System.out.println("\nSTRINGS WITH VOWELS");
        String[] strings2 =  {"Dragon", "Phoenix", "Unicorn","rhythm", "fly", "glyph", "myth"};
        StringsWithVowels.stringsWithVowels(strings2);

        System.out.println("\nAVERAGE OF ODD SQUARES");
        Integer[] numbers = {2, 3, 5, 13, 89, 233, 1597, 28657, 514229, 433494437};
        AverageOfOddSquares.averageOfOddSquares(numbers);

        System.out.println("\nSTRING SORTING");
        StringSorting.stringSorting(strings1);
    }
}
