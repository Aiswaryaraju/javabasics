package com.basic;

public class Rectangle {
	double length;
	double width;
	public Rectangle()
	{
	}
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length>0.0 && length<20.0)
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width>0.0 && width <20.0)
		this.width = width;
	}
	public double findArea()
	{
		return length*width;
		
	}
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r1.setLength (5);
		r1.setWidth(15.0);
		System.out.println(r1.findArea());
		System.out.println(r1.findArea());
	}
	

	

}
