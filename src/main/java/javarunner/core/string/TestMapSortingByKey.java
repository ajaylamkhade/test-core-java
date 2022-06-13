package javarunner.core.string;

import java.util.*;
import java.util.stream.Collectors;
//reverse word order
public class TestMapSortingByKey {

    static Map<Integer,String> greetMap = new HashMap<>();

    public static void main(String[] args) {
        String greeting = "How Are You Ajay";

        String greetArray [] = greeting.split(" ");
        Integer sequence=0;
        for(String s: greetArray){
            System.out.println(s);
            sequence ++;
            greetMap.put(sequence,s);

        }
        System.out.println(greetMap);

        List<Integer> sortedKeys = new ArrayList<>(greetMap.keySet());
        Collections.sort(sortedKeys, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1) ;
            }
        });

        StringBuffer stringBuffer = new StringBuffer();
        for (Integer x : sortedKeys) {
            stringBuffer.append(greetMap.get(x)).append(" ");
        }
        System.out.println(stringBuffer);

        //using stream and LinkedHashMap
      Map<Integer,String>  soretedMap =greetMap.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey().reversed())
               .collect(Collectors.toMap((Map.Entry<Integer,String> e) -> e.getKey(), (Map.Entry<Integer,String > e)-> e.getValue()
                       ,(e1,e2) ->e1,() -> new LinkedHashMap<>()));
        System.out.println(soretedMap);

        //another way using stream
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
       greetMap.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey().reversed()).forEach(
               (e) -> linkedHashMap.put(e.getKey(),e.getValue()));
        System.out.println("linkedHashMap: "+linkedHashMap);
    }

    }



