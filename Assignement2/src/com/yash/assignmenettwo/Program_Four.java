package com.yash.assignmenettwo;

import java.util.Scanner;

//Create a class Area in which user will be asked to input the sides of shape. User will 
//be asked to input three sides of shape. If user input two sides of shape same, you have 
//to print area of square for that side. With 3 inputs you have to print area of rectangle 
//in combination. With 3 sides you have to print the area of triangle. Also check the 
//given three sides are belong to right angle triangle or not

public class Program_Four {
	public static void main(String[] args) {
		boolean loop = true;
		while (loop) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 : To Proceed , Enter 2 : To Stop");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("Enter The First Side Of Shape");
				double sideOne = sc.nextDouble();

				System.out.println("Enter The Second Side Of Shape");
				double sideTwo = sc.nextDouble();

				System.out.println("Enter The ThirdSide Of Shape");
				double sideThree = sc.nextDouble();

				if (sideOne == sideTwo) {
					double areaOfSquare = Math.abs(sideOne * sideTwo);
					System.out.println("Area Of Square");
					System.out.println(areaOfSquare);
					System.out.println("");
				}

				if (sideOne == sideTwo || sideOne != sideThree) {
					double areaOfRectangle = Math.abs(sideThree * sideTwo);
					System.out.println("Area Of Rectangle");
					System.out.println(areaOfRectangle);
					System.out.println("");
				}

				if (sideOne != sideTwo || sideOne != sideThree) {
					double hypotaneous = sideThree;
					if ((hypotaneous * hypotaneous) == (sideOne * sideOne) + (sideTwo * sideTwo)) {
						System.out.println("The Given Traingle Is Right Angle Traingle");

						double areaOfRightAngleTraingle = 0.5 * sideOne * sideTwo;
						System.out.println("Area Of Right Angle Triangle");
						System.out.println(areaOfRightAngleTraingle);
						System.out.println("");
					}

					if ((hypotaneous * hypotaneous) != (sideOne * sideOne) + (sideTwo * sideTwo)) {
						double peri = sideOne + sideTwo + sideThree / 2.0d;
						double areaOfTriangle = Math
								.sqrt(peri * (peri - sideOne) * (peri - sideTwo) * (peri - sideThree));
						System.out.println("Area Of Triangle");
						System.out.println(areaOfTriangle);
						System.out.println("");

					}
				}

			}
			else if (select == 2) {
				break;
			}
		}
	}
}
