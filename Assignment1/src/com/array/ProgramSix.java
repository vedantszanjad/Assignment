package com.array;

import java.util.Scanner;

public class ProgramSix
{
	public static void main(String[] args) 
	{
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements You Want To Add"); 
		n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter The Elements");
		//Entering the Elements In array
		for(int i = 0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		//Logic For Average
		for(int i = 0; i < n; i++)
		{
			if((i + 1) < n)
			{
				double avg = (arr[i] + arr [i + 1])/2;
				System.out.println("Average Of two Consecutive Number " + avg);
			}
			
		}
	}
}
