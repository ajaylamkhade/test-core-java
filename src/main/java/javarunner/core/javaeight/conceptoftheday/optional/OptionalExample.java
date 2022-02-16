package javarunner.core.javaeight.conceptoftheday.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String str [] = new String[10];
        str [5] = "JAVA OPTIONAL CLASS EXAMPLE";
        //it returns empty instance of optioncal class
        Optional<String> empty = Optional.empty();
        System.out.println("Empty: "+empty);

        // It returns a non-empty Optional
        Optional<String> value= Optional.of(str[5]);
        System.out.println("filtered value: "+value.filter(s -> s.equals("Abc")));
        //If value is present, it returns an Optional otherwise returns an empty Optional
        System.out.println("filtered value: "+value.filter(s -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException
        System.out.println("Getting value: "+value.get());
        // It returns hashCode of the value
        System.out.println("Getting hashCode: "+value.hashCode());
        // It returns true if value is present, otherwise false
        System.out.println("Is value present: "+value.isPresent());

        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
        System.out.println("Nullable Optional: "+Optional.ofNullable(str[5]).get());
        // It returns value if available, otherwise returns specified value,
        //value = Optional.ofNullable(null);
        System.out.println("orElse: "+value.orElse("Value is not present"));
        System.out.println("orElse: "+empty.orElse("Value is not present"));
        // printing value by using method reference
        value.ifPresent(System.out::println);

    }
}
