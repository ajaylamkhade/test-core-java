package javarunner.core.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class TestRemoveHashTable {

	public static void main(String[] args) {
		Hashtable<String,Integer> myHASHTB = new Hashtable<>();
		myHASHTB.put("dhawal", 1);
		myHASHTB.put("tushar", 2);
		myHASHTB.put("sneha", 3);
		myHASHTB.put("manasi", 4);


		Enumeration keys = myHASHTB.keys();
		for ( Enumeration e = myHASHTB.elements() ;	e.hasMoreElements() ;e.nextElement()) {

			myHASHTB.put("ajay", 5); //it works
		}

		myHASHTB.keySet().forEach(e->System.out.println(e));
	}

}
