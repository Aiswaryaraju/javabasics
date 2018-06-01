package com.basic;

public class Taxi extends Car {
	public Taxi () { 
		super();
		System.out.println("Inheritance");
	}
	public Taxi (int i) {
		this();
		
		System.out.println("Inheritance with single args " +i);
	}
	  public static void main(String args[]) {
	  Taxi taxi2=new Taxi();
	  Taxi taxi1=new Taxi(100);
	
  }
}