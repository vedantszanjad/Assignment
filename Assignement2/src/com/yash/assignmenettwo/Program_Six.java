package com.yash.assignmenettwo;
import java.util.Scanner;


//With the help of method overriding perform the string comparison. User will input 
//two string and your task is to compare both the string one alphabets at a time.

class Comparison 
{
public void m1(String strOne ,String strTwo)
{
}


}
public class Program_Six extends Comparison {

	@Override
	public void m1(String strOne, String strTwo) {

		super.m1(strOne, strTwo);
		int flagForStringOne=0,flagForStringTwo=0;
		for (int i = 0, j = 0; j < strTwo.length() && i < strOne.length(); j++, i++) {

			if (strOne.charAt(i) > strTwo.charAt(j)) {
				System.out.println(strOne.charAt(i) + " IS Greater Than : " + strTwo.charAt(j));
				flagForStringOne++;
			}

			else if (strOne.charAt(i) < strTwo.charAt(j)) {
				System.out.println(strOne.charAt(i) + " IS Less Than :" + strTwo.charAt(j));
				
			}

			else {
				System.out.println("Both Strng Are Same");
			}

		}
		
		if (strOne.length()>strTwo.length()) {
			System.out.println(strOne+" Is greater then "+strTwo);
		}
		else if (strOne.length()<strTwo.length()) {
			System.out.println(strTwo+" Is greater then "+strOne);
		}
		else 
		{
			if (flagForStringOne > flagForStringTwo) {
				System.out.println(strOne + " IS Greater Than : " + strTwo);
			}

			else if (flagForStringOne < flagForStringTwo) {
				System.out.println(strOne+ " IS Less Than :" + strTwo);
				flagForStringTwo ++;
			}
			else {
				System.out.println("Both Are Same");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First String");
		String first = sc.next();

		System.out.println("Enter The Second String");
		String second = sc.next();

		String strOne = first;
		String strTwo = second;

		Comparison comp = new Program_Six();
		comp.m1(strOne, strTwo);

	}
}
