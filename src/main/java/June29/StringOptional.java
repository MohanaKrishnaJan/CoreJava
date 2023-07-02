package June29;

import java.util.Optional;

public class StringOptional {
    public static Optional<Integer> getStringLength(String input) {
        if (input != null) {
            return Optional.of(input.length());
        } else {
            return Optional.empty();
        }
    }

    public static Optional<String> convertToUpperCase(Optional<String> input) {
        if (input.isPresent()) {
            String result = input.get().toUpperCase();
            return Optional.of(result);
        } else {
            return Optional.empty();
        }
    }
}
