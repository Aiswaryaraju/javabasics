package com.basic;

public class Test extends Vechicle {
	public static void main(String[] args) {
	
		Test tc=new Test();
		BmwCar bc=new BmwCar();
		PoliceCar pc=new PoliceCar();
		SportsCar sc=new SportsCar();
		
		tc.brake(tc);
		tc.brake(bc);
		tc.brake(pc);
		tc.brake(sc);
		Vechicle vecone []= {new SportsCar(),new BmwCar(),new PoliceCar()};
		for (int i = 0; i < vecone.length; i++) {
			vecone[i].brake();
			
		}

	
	
	}
	
	
	private void brake(Vechicle vecone) {
		// TODO Auto-generated method stub
		System.out.println("POLYMORPHISM");
		
	}


	
	
	
}
