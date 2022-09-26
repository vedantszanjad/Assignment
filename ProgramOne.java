package com.array;

import java.util.Scanner;

public class ProgramOne 
{
	public static void main(String[] args) 
	{
		int n ;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements You Want To Add"); 
		n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter The Elements");
		//Elements Are Added To The Array
		for(int i = 0; i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		
		
		//Logic For Smallest Number
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1 ; j < n; j++ )
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			System.out.println(arr[i]);
		}
		System.out.println("Smallest");
		System.out.println(arr[2]);	
	}
}
