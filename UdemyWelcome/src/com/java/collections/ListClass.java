package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> currencyString = new ArrayList<String>();
		
		// Adding Element to the List
		
		currencyString.add("INR");
		currencyString.add("Dol");
		currencyString.add("Pou");
		currencyString.add("Eur");
		
		// How many countries are there?
		
		int noOfCountries = currencyString.size();
		System.out.println("No of Countries:"+noOfCountries);
		
		Collections.sort(currencyString); // Sort the Stored Data
		
		if(currencyString.isEmpty())
		{
			System.err.println("No Countries are there...");
		}else {
			for(String listOfCountries : currencyString) // For each Loop
			{
				System.out.println("List of Countries :"+listOfCountries);
			}
		}
		

	}

}
