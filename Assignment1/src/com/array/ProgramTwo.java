package com.array;

import java.util.Scanner;

public class ProgramTwo 
{
	public static void main(String[] args) 
	{
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
		
		//Logic For To Remove The Duplicates
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1 ; j < n; j++ )
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Duplicates Elements Are :" + arr[i]);
					arr[j] = arr[n - 1];
					n--;
				}
			}
		}
		System.out.println("New Array Without Repeatations");
		for(int i = 0; i < n; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}


//public class A2 {
//    /*
//     * //2) WAP to remove duplicate numbers from list of numbers. public static void
//     * main(String[] args) { int[] a = new int[] { 12, 15, 17, 10,10 }; int size =
//     * a.length; int temp = 0; int j=0; int[] b=new int[6]; for(int i=0;i<size;i++)
//     * { if(a[i] !=a[i+1] || a[i+1]<=size) { b[j]=a[i]; } System.out.println(b[j]);
//     * }
//     *
//     *
//     * }
//     */
//    // Java program to print all distinct
//    // elements in a given array
//
//
//
//   static void printDistinct(int arr[], int n)
//    {
//    // Pick all elements one by one
//    for (int i = 0; i < n; i++)
//    {
//    // Check if the picked element
//    // is already printed
//    int j;
//    for (j = 0; j < i; j++)
//        
//    if (arr[i] == arr[j])
//    break;
//
//
//
//   // If not printed earlier,
//    // then print it
//    if (i == j)
//    System.out.print( arr[i] + " ");
//    }
//    }
//
//
//
//   // Driver program
//    public static void main (String[] args)
//    {
//    int arr[] = {6, 10, 5, 4, 9, 120, 4, 6,9, 10,10,10};
//    int n = arr.length;
//    printDistinct(arr, n);
//
//
//
//   }
//    



   // This code is contributed by vt_m
//}