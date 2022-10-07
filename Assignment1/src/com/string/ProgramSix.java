package com.string;

import java.util.Scanner;

public class ProgramSix 
{
	public static void main(String[] args) 
	{
		int countF = 0;
		int countS = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Strings");
		char[] firstStr = sc.nextLine().toCharArray();	
		//Calculating The length Of The String 
		for(char fStr : firstStr)
		{
			countF++;
		}
		
		int n = countF;
		
		System.out.println("Enter the Token To Split The String ");
		String tok = sc.next();
		char [] tokens = tok.toCharArray();
		char token = tokens[0];
		//Logic For The Spliting The String
		for(int i = 0; i < n; i++)
		{
			if(firstStr[i] == token)
			{
				System.out.println("\n");
			}
			else
			{
				System.out.println(" " + firstStr[i]);
			}
		}
		
	}
}