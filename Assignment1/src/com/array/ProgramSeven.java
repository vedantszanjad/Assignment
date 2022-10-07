package com.array;

import java.util.Scanner;

public class ProgramSeven 
{
	public static int findHcf(int a , int b)
	{
		if(b == 0)
	
		return a;
		return findHcf(b,a % b);
		
	}
	
	
	public static void main(String[] args)
	{
		int min,max,x,lcm = 0;
		int n ;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements You Want To Add"); 
		n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter The Elements");
		
		for(int i = 0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		int result = arr[0];
		//Logic For HCF And LCM
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1 ; j < n - 1; j++ )
			{
				if(arr[i] > arr[j])
				{
					min = arr[j];
					max = arr[i];
				}
				else
				{
					min = arr[i];
					max = arr[j];
				}
				
				for(int k = 0; k < n; k++)
				{
					x = k * max;
					if(x % min == 0)
					{
						lcm = x;
					}
				}
				
				for(int k = 0; k < n;k++)
				{
					result = findHcf(arr[i], result);
				}
				
			}
		}
		System.out.println("Hcf " + result);
		System.out.println("Lcm " + lcm);
	}
}
