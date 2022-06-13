package javarunner.core.string;// Java Code to sort Map by key value
import java.util.*;
class sortmapKey {

	// This map stores unsorted values
	static Map<Integer,String> map = new HashMap<>();

	// Function to sort map by Key
	public static void sortbykey()
	{
		ArrayList<Integer> sortedKeys
			= new ArrayList<Integer>(map.keySet());

		Collections.sort(sortedKeys);

		// Display the TreeMap which is naturally sorted
		for (Integer x : sortedKeys)
			System.out.println("Key = " + x
							+ ", Value = " + map.get(x));
	}

	// Driver Code
	public static void main(String args[])
	{
		// putting values in the Map
	/*	map.put("Jayant", 80);
		map.put("Abhishek", 90);
		map.put("Anushka", 80);
		map.put("Amit", 75);
		map.put("Danish", 40);
*/

		map.put(80,"Jayant");
		map.put(90,"Abhishek");
		map.put(80,"Anushka");
		map.put(75,"Amit");
		map.put(40,"Danish");


		// Calling the function to sortbyKey
		sortbykey();
	}
}
