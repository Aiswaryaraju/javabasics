package com.basic;

public class TwoDimension extends Shape {
	float base;
	float height;
	float a;
	float b;
	float h;
	double area;

	public void triangle(float base,float height)
	{
		
		area=(0.5f* base* height);
		System.out.println("triangle:"+area);
	}
	public void trapezium(float a,float b,float h)
	{
		this.base=base;
		this.height=height;
		area=(0.5f* (a + b)* h);
		System.out.println("trapezium:"+area);
    }


	public static void main(String[] args) {
		TwoDimension tri=new TwoDimension();
		TwoDimension tra=new TwoDimension();
		tri.diagram();
		tra.diagram();
		tra.trapezium(1000.5f,200.0f,20.0f);
		tri.triangle(8,8);

		
		
		
		
	}
}

