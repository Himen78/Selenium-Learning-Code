package com.java.udemy;

public class ProductObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDetails p1 = new ProductDetails();
		ProductDetails p2 = new ProductDetails();
		
		p1.codeOfProduct = 5544333;
		p1.nameOfProduct = "Biometric Scannner";
		p1.priceOfProduct = 5000;
		
		p2.codeOfProduct = 5567889;
		p2.nameOfProduct = "Biometric Scannner";
		p2.priceOfProduct = 7800;
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
