package com.basic;



public class SportsCar extends Vechicle {
	public SportsCar() {
		//this();
		super();
		System.out.println("Subclass empty constuctor");
	}
	public SportsCar(int number) {
		//super();
		this();
		System.out.println("Subclass one args");
	}
	public SportsCar(String name,double modelnumber) {
		//super();
		//this();
		System.out.println("Subclass two args");
		
	}
	@Override
	public void brake()
	{
		System.out.println("Sports brake applied");
	
	}
	
	public static void main(String[] args) {
		
		SportsCar sportpro=new SportsCar();
		sportpro.brake();
		SportsCar sc=new SportsCar();
		sc.brake();

		
	}

}
