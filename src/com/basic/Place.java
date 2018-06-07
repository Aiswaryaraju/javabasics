package com.basic;

public abstract class Place implements Tour {
	

}
class Ooty extends Place 
{

public void getAmount()
{
	System.out.println("PLACE VISITED OOTY");
}

	public static void main(String[] args) {
		Ooty cool = new Ooty();
		
	}
}
class Trichy extends Place {

public void getAmount()
{
	System.out.println("PLACE VISITED TRICHY");
}

	public static void main(String[] args) {
		Trichy hot = new Trichy();
		
	}
}
class Cbe extends Place {

public void getAmount()
{
	System.out.println("PLACE VISITED CBE");
}

	public static void main(String[] args) {
		Cbe moderate = new Cbe();
		
	}
}