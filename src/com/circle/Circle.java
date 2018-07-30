package com.circle;

public class Circle {
	
	private double radius;
	private double circumference;
	private double area;
	String format;
	
	
	public Circle(double r)  {
		radius = r;
			}
	
	public double getCircumference()  {
	return  2 * (Math.PI * radius);
	}
		 
	
	
	public String getFormattedCircumference(){
		getFormattedNumber(circumference);
		return format;
	}
	
	public double getArea()  {
		area = Math.PI * (radius * radius);
		return area;
			
	}
	
	
	public String getFormattedArea()  {
		getFormattedNumber(area);
		return format ;
		
		
	}
	
	private String getFormattedNumber(double x)   {
		//circumference = x;
		format = String.format("%.2f", x);
		//System.out.printf(String.format("%.2f ", x));
		return format;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", circumference=" + circumference + ", area=" + area + ", format=" + format
				+ "]";
	}

	
	
	

}
