package com.java.collections;

public class BoxClass {
	
	public int length;
	public int width;
	public String color;
	public int height;
	
	
	public BoxClass(int length, int width, String color, int height) {
		
		this.length = length;
		this.width = width;
		this.color = color;
		this.height = height;
	}


	@Override
	public String toString() {
		return "BoxClass [length=" + length + ", width=" + width + ", color=" + color + ", height=" + height + "]";
	}
	
	
	

}
