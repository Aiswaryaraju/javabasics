package com.basic;

import java.util.Scanner;

public class Print {
      int base;
	  int height;
	  float area=(0.5f* base* height);
	 
	 
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("ENTER BASE:");
		 System.out.println("ENTER HEIGHT :");
		 System.out.println("AREA OF TRIANGLE :");
		 int base =scanner.nextInt();
		 int height =scanner.nextInt();
		 float area=scanner.nextFloat();
		
		 
	 }
	 
}

