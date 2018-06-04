package com.basic;

public class Car {
	private String model;
	int i=10;
	public double speed=20;
	public  Car() 
	{
		System.out.println("empty cons");
	}
	public Car(int speed)
	{
		this();
		this.speed=speed;
		System.out.println("sinlge args");
	}
	public Car(int speed,String model)
	{
		this(speed);
		this.speed=speed;
		this.model=model;
		System.out.println("double args");
	}
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("CAR CAR");
		
	}
	public static void main(String args[])
	{
		Car c1=new Car(100);
		Car c2=new Car(100,"BMW");
		System.out.println(c2.speed);
		
	
		
	}
	

}
