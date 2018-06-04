package com.basic;

public class Vechicle { 
	String name="BMW";
	static int i=45;
	double modelnumber=45.00;
	public Vechicle()
    {
		System.out.println("Empty args");
	}
	protected Vechicle(int i)
	{
		this();
		Vechicle.i=i;
	
	System.out.println("One args");
	}
	public  Vechicle(String name,double modelnumber)
	{
		this();
		this.name=name;
		this.modelnumber=modelnumber;
		System.out.println("Two args");
	}
	public void brake()
	{
		System.out.println("Vechicle brake applied");
	
	}
	
public static void main(String[] args) {
	
	Vechicle vecone=new Vechicle();
	vecone.brake();
}
}

