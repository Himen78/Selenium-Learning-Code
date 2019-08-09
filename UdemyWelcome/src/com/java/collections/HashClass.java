package com.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashClass {

	public static void main(String[] args) {

		Map<String, String> currencyMap = new HashMap<String, String>();
		
		currencyMap.put("INR", "Indian Rupees");
		currencyMap.put("USD", "US Dollor");
		currencyMap.put("EUP", "Euro");
		
		String currencyKey = "EUP";
		String currencyName = "";
		if(currencyMap.containsKey(currencyKey))
		{
			System.out.println("Currency found for Key:"+currencyKey);
			System.out.println(currencyMap.get(currencyKey));
		}else {
			System.out.println("Currency NOT found for Key:"+currencyKey);
	}
		// Loop through the map and print all the values.
		
		Set<String> currencyKeys = currencyMap.keySet();
		for(String currKey : currencyKeys)
		{
			System.out.println(currKey + " > " + currencyMap.get(currKey));
		}
}
}
