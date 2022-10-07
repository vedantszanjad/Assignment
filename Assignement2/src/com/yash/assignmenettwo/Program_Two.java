package com.yash.assignmenettwo;

import java.util.Scanner;

interface Shape 
{	
	public double area(double a, double b);
	
}


class Circle implements Shape
{
	double r;

	@Override
	public double area(double a,double b) 
	{
	
		double area = Math.abs(3.14* a * a);
		System.out.println(area);
		return area;
	}
	
}

class Spheres implements Shape
{
	double a;

	@Override
	public double area(double a ,double b) 
	{
		double area = Math.abs(a * a);
		System.out.println(area);
		return area;
	}
	
}


class Traingle implements Shape
{
	double height;
	double base;
	
	@Override
	public double area(double a ,double b) 
	{
		this.height = a;
		this.base = b;
		double area = Math.abs(0.5 *height *base);
		System.out.println(area);
		return area;
	}
}

public class Program_Two 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Select (1 : For Triangle, 2 : For Circle, 3 :For Sphere, 4 : To Stop)");
		int select = sc.nextInt();
		
		if(select == 1)
		{
		System.out.println("Enter The First Parameter");
		double a = sc.nextDouble();
		
		System.out.println("Enter The Second Parameter");
		double b = sc.nextDouble();
		
		System.out.println("");
		Traingle t = new Traingle();
		System.out.println("Area Of Traingle");
		t.area(a, b);
		System.out.println("");
		}
		
		if(select == 2)
		{
		System.out.println("Enter The Parameter");
		double a = sc.nextDouble();
		
		Circle c = new Circle();
		System.out.println("Area Of Circle");
		c.area(a, 0);
		System.out.println("");
		}
		
		if(select == 3)
		{
		System.out.println("Enter The Parameter");
		double a = sc.nextDouble();
		Spheres sphere = new Spheres();
		System.out.println("Area Of Sphere");
		sphere.area(a, 0);
		System.out.println("");
		}
		
		if(select == 4)
		{
			break;
		}
		}
	}
}
