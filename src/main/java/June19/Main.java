package June19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            names.add("Tree" + i);

        StringTraverse.stringTraverse(names);

        RemoveLastElement.removeLastElement(names);

        RemoveLessThanAvgStudents.removeLessThanAvgStudents();

        ArrayListToArray.arrayListToArray(names);
    }
}
