package June19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringTraverse {

    public static void stringTraverse(ArrayList<String> input) {

        System.out.println("traversing elements using for loop");
        for (int i = 0; i < 10; i++)
            System.out.println(input.get(i));

        System.out.println("\ntraversing elements using enhanced for loop");
        for (String s : input)
            System.out.println(s);

        System.out.println("\ntraversing elements using Iterator");
        Iterator<String> inputItr = input.iterator();
        while (inputItr.hasNext()) {
            String name = inputItr.next();
            System.out.println(name);
        }

        System.out.println("\ntraversing elements using forEach");
        input.forEach(s -> System.out.println(s));

        System.out.println("\ntraversing elements using parallel stream");
        input.parallelStream()
                .forEach(System.out::println);
    }
}