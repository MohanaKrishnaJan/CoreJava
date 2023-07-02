package June20;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void characterCount(String input){
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == ' ')
                continue;

            // If the character is already present, increment its count
            if (charCountMap.containsKey(ch)) {
                int count = charCountMap.get(ch);
                charCountMap.put(ch, count + 1);
            }
            // Otherwise, add the character to the map with count 1
            else {
                charCountMap.put(ch, 1);
            }
        }

        // Print the distinct characters and their counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            System.out.println(ch + "-" + count);
        }
    }
}

