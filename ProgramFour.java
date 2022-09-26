package com.array;

import java.util.Scanner;

public class ProgramFour
{
	public static void main(String[] args)
	{
		int n ;
		int first = 0;
		int second = 0;
		int third = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements You Want To Add"); 
		n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter The Elements");
		//Entering The Elements In Array
		for(int i = 0; i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		//Logic For The Requirement
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n;j++)
			{
				for(int k = 0; k < n;k++)
				{
					first = arr[i];
					second = arr[j];
					third = arr[k];
					if(first * first + second * second == third * third)
					{
						System.out.println(first);
						System.out.println(second);
						System.out.println(third);
					}
				}
			}
		}
	}
}
