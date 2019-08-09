package com.java.collections;

import java.util.ArrayList;
import java.util.List;



public class ArrayListExampleWithObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<BoxClass> objectList = new ArrayList<BoxClass>();
		BoxClass b1 = new BoxClass(11, 23, "Red", 60);
		BoxClass b2 = new BoxClass(22, 45, "Yello", 67);
		
		objectList.add(b1);
		objectList.add(b2);
		
		for(BoxClass features : objectList)
		{
			System.out.println(features);
		}
		
		
		
		

	}

}
