package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Banana");
		set.add("Grapes");
		set.add("Orange");
		set.add("Banana");
		
		
		for(String listOfFruit : set)
		{
			System.out.println(listOfFruit);
		}
		
		String lookingForFruit = "Banana";
		if(set.contains(lookingForFruit))
		{
			System.out.println("Found- " + lookingForFruit);
		}else {
			System.err.println("Fruit- " + lookingForFruit + "-not found");
		}
		
		
	}

}
