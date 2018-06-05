package com.basic;


public class ThreeDimension extends Shape {
	double length;
	double area;
	double height;
	public void Sphere() {
		
		System.out.println("Empty Sphere");
	}
public void Sphere(double length,double lenght ) {
	area=4*3.17*length*length;
	System.out.println("Area of Sphere:"+area);
}
public void  Cone() {
	
	System.out.println("Empty of cone");
}
public void  Cone(double area,double length) {
	area=0.5f*area*length;
	System.out.println("Area of cone is:"+area);
}
public static void main(String[] args) 
{
	ThreeDimension sphere=new ThreeDimension();
	ThreeDimension cone=new ThreeDimension();
	sphere.diagram();
	cone.diagram();
	sphere.Sphere(10,10);
	cone.Cone(20,20);
}














}

