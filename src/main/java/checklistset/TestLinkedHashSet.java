package checklistset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

        public static void main(String[] args) {
           //Set <String> stringSet = new HashSet<>();
           Set <String> stringSet = new LinkedHashSet<>();

            stringSet.add("Q");
            stringSet.add("D");
            stringSet.add("Z");
            stringSet.add("P");
            stringSet.add("C");
            stringSet.add("B");
            stringSet.add("A");

            System.out.println(stringSet);
    }
}
