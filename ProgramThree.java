package com.array;

import java.util.Scanner;

public class ProgramThree
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Dymanic Array Operations");
		System.out.println("Enter the intial size of array : ");
		int sizOfArray=sc.nextInt();
		Array array = new Array(sizOfArray);
		System.out.println("Intial size of array is set to be : "+sizOfArray);
		for (;;) {
			System.out.println("Chose one from the below options...");
			System.out.println("1.Add element in array\n2.Print\n3.Exit");
			System.out.println(" Enter your choice");
			choice = sc.nextInt();
			//Logic For Operation On Array
			switch (choice)
			{
			case 1: 
			{
					System.out.println("Enter the element ");
					array.insert(sc.nextInt());
					break;
			}
				case 2: 
				{
					array.printArray();
					break;
				}
				case 3: 
				{
					System.out.println("Exiting....");
					System.exit(0);
					break;
				}
				default: 
				{
					System.out.println("Please Enter valid choice ");
				}
			}

		}
	}

}


//Logic For Dynamic Array 
class Array 
{

	private int arr[];
	private int count;

	public Array(int length)
	{
		arr = new int[length];
	}

	public void printArray()
	{

		for (int i = 0; i < count; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}

	public void insert(int element) 
	{

		if (arr.length == count) 
		{

			int newArr[] = new int[2 * count];

			for (int i = 0; i < count; i++) 
			{
				newArr[i] = arr[i];
			}

			arr = newArr;
			System.out.println("Element inserted Sucessfully !");
		}

		arr[count++] = element;
	}
}
