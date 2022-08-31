package Assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment2_HashMap {

	public static void main(String[] args) {
//Create a HashMap with the following key-valuepairs:
System.out.println("1. Create a HashMap with the following key-valuepairs:");		
		HashMap<String,String> software = new HashMap<String,String>();
		software.put("Eclipse","Free Open Source IDE");
		software.put("Ruby Mine","Enterprise IDE, It's expensive");
		software.put("Visual Studio","Enterprise IDE, It's expensive");
		software.put("IntelliJ","Free Open Source IDE");
		
			
//Write a java program to perform the following tasks:
//▪Print the value associated with the ‘Eclipse’key.
		System.out.println("2. Print the value associated with the ‘Eclipse’key.");
		for(Map.Entry m:software.entrySet())
		 {
		if(m.getKey().equals("Eclipse")) 
		{
	        System.out.println("value associated with the Eclipse key is = " + m.getValue());
	        
//▪Update the value of the ‘Eclipse’keyto ‘It is best!’ and print the new value.
	        System.out.println("3. Update the value of the ‘Eclipse’keyto ‘It is best!’ and print the new value.");
	        software.put("Eclipse", "It is best");
	        System.out.println("Updated value associated with the Eclipse key is = " + m.getValue());
	    }   
		 }
		
//▪Remove the ‘Eclipse’keyand its value from the Map and print the value associated with the ‘Eclipse’key.		
		System.out.println("4. Remove the ‘Eclipse’keyand its value from the Map and print the value associated with the ‘Eclipse’key");
		String str =(String)software.remove("Eclipse");
		System.out.println("After removing printing the value associated with Eclispe now = " +str);
		
//▪Print the total number of items in the Map.
		System.out.println("5. Print the total number of items in the Map.");
		System.out.println("Total number of items in the Map = "+software.size());
		
		
//▪Iterate through all the items of the Map and print each key-value pair present in the Map through an Iterator.
		System.out.println("6. Iterate through all the items of the Map and print each key-value pair present in the Map through an Iterator.");
		Iterator<Entry<String, String> > Itr = software.entrySet().iterator();

    // Iterating every set of entry in the HashMap
    while (Itr.hasNext()) 
    {
        Map.Entry<String, String> new_Map = (Map.Entry<String, String>)Itr.next();

        // Displaying HashMap
        System.out.println(new_Map.getKey() + " = "+ new_Map.getValue()); 
			
    }
			
//▪Iterate through all the items ofthe Map and print each key-value pair present in the map using the for loop.
		System.out.println("7. Iterate through all the items ofthe Map and print each key-value pair present in the map using the for loop");	
        for (Map.Entry<String, String> set :software.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
        }
        
//▪Clear the contents of the Map.
        System.out.println("8. clear the contents of the Map");
        software.clear();
        
			
//▪Print the contents of the Map after clearing the contents. 
       System.out.println("9. Print the contents of the Map after clearing the contents.");
        for(Map.Entry k:software.entrySet())
        		{
        System.out.println(k.getKey() + " = "+ k.getValue());
	} 
	}
}

