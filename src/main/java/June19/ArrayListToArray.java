package June19;

import java.util.*;

public class ArrayListToArray {
    public static void arrayListToArray(ArrayList<String> input){
        System.out.println("\nInput Class : " + input.getClass());
        String[] array = input.toArray(new String[input.size()]);
        System.out.println("Output Class : " + array.getClass());
    }
}
