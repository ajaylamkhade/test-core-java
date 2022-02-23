package javarunner.core.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * This Registry class which is responsible for storing one object
 * from each source object and returning the newly duplicated object
 */
public class Registry {

    private Map<String,Dress> registryMap=null;

    public Registry(){
        registryMap = new HashMap<>();
        initialize();
    }

    private void initialize() {
        Dress tShirt = new Tshirt();
        registryMap.put("Tshirt",tShirt);
        Dress denim = new Denim();
        registryMap.put("Denim",denim);
    }

    public  Dress getClone(String dressType) throws CloneNotSupportedException {
        return (Dress)registryMap.get(dressType).clone();
    }
}
