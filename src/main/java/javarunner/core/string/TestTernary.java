package javarunner.core.string;

import java.util.HashMap;
import java.util.Map;

public class TestTernary {

    public static void main(String[] args) {
        Map<String,Long> map = new HashMap<>();
        long issuerId=10004;

        map.put("key",issuerId!=1?issuerId:1);

        System.out.println("Key value: "+ map.get("key"));

        boolean triedOnce=true;
        if(!triedOnce){
            System.out.println("triedOnce true");
        }
        String name="jay";
        name=null;
        try {
            if (name.equals("jay")) {
                System.out.println(name);
            }
        }catch (Exception e){
            System.out.println("Exception :"+e);
        }


    }
}
