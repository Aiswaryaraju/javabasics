package com.basic;
public abstract class Abstract {
	int i;
	public  Abstract ()
	
	{
		System.out.println("CONSTRUCTOR CALLING");
	}
public  Abstract (int i)
	
	{
		System.out.println("CONSTRUCTOR CALLING WITH ONE ARGS");
	}
	public abstract void item();
	public static void main(String[] args) {
		// Abstract abc=new Abstract ();
		SubAbstract sabc=new SubAbstract();
		SubAbstract con=new SubAbstract(10);
		sabc.item();
	}
}
class SubAbstract extends Abstract  {
@Override
public void item() {
	// TODO Auto-generated method stub
	System.out.println("THIS IS AN ABSTRACT CLASS");
}
public  SubAbstract ()

{
	System.out.println("SubAbstract CONSTRUCTOR CALLING");
}
public  SubAbstract (int i)

{
	this();
	this. i=i;
	System.out.println("SubAbstract CONSTRUCTOR CALLING WITH ONE ARGS");
}
	
}