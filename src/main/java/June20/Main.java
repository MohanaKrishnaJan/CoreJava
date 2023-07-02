package June20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, StudentHashMap> studentHashMap = new HashMap<>();

        studentHashMap.put("S1", new StudentHashMap("S1", "ln1", 6.5));
        studentHashMap.put("S2", new StudentHashMap("S2", "ln2", 7.2));
        studentHashMap.put("S3", new StudentHashMap("S3", "ln3", 9.2));
        studentHashMap.put("S4", new StudentHashMap("S4", "ln4", 9.8));
        studentHashMap.put("S5", new StudentHashMap("S5", "ln5", 9.1));
        studentHashMap.put("S6", new StudentHashMap("S6", "ln6", 8.8));
        studentHashMap.put("S7", new StudentHashMap("S7", "ln7", 8.6));
        studentHashMap.put("S8", new StudentHashMap("S8", "ln8", 9.6));


//        System.out.println("Using entrySet()");
//        for(Map.Entry<String, StudentHashMap> student: studentHashMap.entrySet()){
//            String firstName = student.getKey();
//            StudentHashMap sobj = student.getValue();
//            System.out.println("FirstName: " + firstName + " Student Object: " + sobj);

        int i = 1;
        int[] arr = new int[1];//        }
        System.out.println(studentHashMap.entrySet());

        System.out.println("\nUsing forEach()");
        studentHashMap.forEach((fn, sobj) -> System.out.println("FirstName: " + fn + " Student Object: " + sobj));

        System.out.println("\nUsing KeySet and Iterator");
        Iterator<String> itr = studentHashMap.keySet().iterator();
        while (itr.hasNext()){
            String fn = itr.next();
            System.out.println("FirstName: " + fn + " Student Object: " + studentHashMap.get(fn));
        }

        System.out.println("\nCharacter Count");
        CharacterCount.characterCount("test string");
        System.out.println("\nFinding Two Sum");
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] result = TwoSum.findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("[" + result[0] + "," + result[1] + "]");
        } else {
            System.out.println("No two numbers found that add up to the target sum.");
        }
    }
}
