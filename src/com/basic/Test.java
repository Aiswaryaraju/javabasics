package com.basic;

public class Test {
	public static void main(String[] args) {
	
		Test tc=new Test();
		PoliceCar pc=new PoliceCar();
		SportsCar sc=new SportsCar();
		BmwCar bc=new BmwCar();
	
		
		
		
		tc.brake(pc);
		tc.brake(sc);
		tc.brake(bc);
		
		
	

	
	
	}
	
	
	public void brake(Vechicle vecone)  
	{
			vecone.brake();
	}


	
	
	
}
