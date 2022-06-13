package javarunner.core.interview.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap1 {

    static List<User> userList = Stream.of(
            new User("user1",98221426790l, Arrays.asList("abc@gmail.com","def@gmail.com")),
            new User("user2",98221426802l, Arrays.asList("ghi@gmail.com","jkl@gmail.com")))
            .collect(Collectors.toList());

    public static void main(String[] args) {
        List<Long> phoneNumbers = userList.stream().map(user -> user.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
        //here map method returns list of list of emails
        List<List<String> >  emailList = userList.stream().map(user -> user.getEmails()).collect(Collectors.toList());
        System.out.println(emailList);

        //flatMap return flattened email list
        List<String> flattenEmailList = userList.stream().flatMap(user -> user.getEmails().stream()).collect(Collectors.toList());
        System.out.println(flattenEmailList);

    }
}
