package javarunner.core.interview.javaeight;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java Program to sort a HashMap by Values (Ascending and Descending Order)
 *
 * Read more: https://javarevisited.blogspot.com/2017/09/java-8-sorting-hashmap-by-values-in.html#ixzz7rUdqLdBB
 */
public class TestHashMapSortingWithStream {

    public static void main(String[] args) {
        //create budget map
        Map<String,Integer> budgetMap= createBuget();
        /**toMap() has first[key] and second[value] arguments are of type Function ,next is of type BiFunction (e1,e2)
        and last one is of type Supplier to create LinkedHashMap**/
        Map<String,Integer> sortedMap =budgetMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.
                toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e2,LinkedHashMap::new));
        System.out.println("map values in ascending order:"+sortedMap);

        //reverse the order of map values
        Map<String,Integer> sortedReverseMap =budgetMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e2,LinkedHashMap::new));
        System.out.println("map values in descending order:"+sortedReverseMap);

        //prints the key based on value sorting
        //budgetMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(s -> System.out.println(s.getKey()));
        //Collection<Integer> collection =budgetMap.values();
        // we can add Collection type object to ArrayList constructor to convert it to ArrayList
        //List<Integer> list = new ArrayList<>(budgetMap.values());
        //convert to List
        //List<Integer> valuesList =collection.stream().collect(Collectors.toList());
       // List<Integer> valuesList =collection.stream().sorted(Comparator.comparing(n->n.intValue())).collect(Collectors.toList());
        //System.out.println(valuesList);



        //lets sort this map by values first
       // budgetMap.values().stream().forEach(value -> System.out.println(value) );
       // System.out.println("forEachOrdered: ");
       // Stream.of("AAA","BBB","CCC").forEach(str -> System.out.println(str));
        //budgetMap.values().stream().forEachOrdered(value -> System.out.println(value) );

    }

    private static Map<String,Integer> createBuget(){
        Map<String,Integer> budgetMap = new HashMap<>();
        budgetMap.put("clothes" ,120);
        budgetMap.put("grocery",150);
        budgetMap.put("transportation",100);
        budgetMap.put("utility",130);
        budgetMap.put("rent",1150);
        budgetMap.put("miscellaneous",90);

        System.out.println("budgetMap before sorting : "+budgetMap);

        return budgetMap;
    }
}
