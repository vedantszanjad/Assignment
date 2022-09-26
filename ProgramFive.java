package com.array;

import java.util.Scanner;

public class ProgramFive
{
	public static void main(String[] args) 
	{
		int n ;
		int sum = 0;
		int countEven = 0;
		int countOdd = 0;
		int countPerfect = 0;
		int countPrime = 0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements You Want To Add"); 
		n = sc.nextInt();
		int [] arr = new int[n];
		//Entering The Elements In Array
		for(int i = 0; i < n;i++)
		{
			System.out.println("Enter The Elements");
			arr[i] = sc.nextInt();
		}
		System.out.println("End getting array");
		//Calculatin The Sum Of Digit Numbers
		for(int i = 0; i < n; i++)
		{
			sum = 0;
			System.out.println("value if array  "+arr[i]);
			
			while(arr[i]>0)
	        {
	            rem = arr[i] % 10;
	    		sum = sum + rem;
	    		arr[i]= arr[i] / 10;
	        }
			System.out.println("");
			System.out.println("The Sum of Digits of " + i );
			System.out.println(sum);
			//Logic To Identify The Number Form
	    		if(sum % 2 == 0)
	    		{
	    			countEven ++;
	    			
	    		}
	    		
	    		if (sum % 2 != 0 )
	    		{
	    			countOdd ++;
	    		}
	    		if( sum == 2 || sum == 3 || sum == 5 || sum == 7 )
	    		{
	    			countPrime ++;
	    		}
	    		else if(sum % 2 != 0 && sum % 3 != 0 && sum % 5 != 0 && sum % 7!= 0)
	    		{
	    			countPrime++;
	    		}
	    		
	    		else
	    		{
	    			countPerfect ++;
	    		}
	        }
			
			System.out.println(" ");
			System.out.println("Even Count :" + countEven);
			System.out.println("Odd Count :"+ countOdd);
			System.out.println("Prime :" + countPrime);
			System.out.println("Perfect Count :" + countPerfect);
		
		}
	
}
