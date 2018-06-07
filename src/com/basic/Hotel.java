package com.basic;

public abstract  class Hotel implements Tour {
	

	
}



class Star1 extends Hotel {

public void getAmount()
{
	System.out.println("HOTEL ROOMS star1");
}

	public static void main(String[] args) {
		Star1 start1 = new Star1();
		
	}
}
class Star2 extends Hotel {

public void getAmount()
{
	System.out.println("HOTEL ROOMS star2");
}

	public static void main(String[] args) {
		Star2 start2 = new Star2();
		
	}
}
class Star3 extends Hotel {

public void getAmount()
{
	System.out.println("HOTEL ROOMS star3");
}

	public static void main(String[] args) {
		Star3 start3 = new Star3();
		
	}
}
