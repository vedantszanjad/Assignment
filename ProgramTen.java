package com.array;

import java.util.Scanner;

public class ProgramTen 
{
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = in.nextInt();

		String[] arr = new String[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter the elements of the array: "+(i+1));
			arr[i]=in.next();
		}
		sort(arr, n);
		printArraystring(arr, n);

	}

	static void sort(String[] s, int n) 
	{
		for (int i = 1; i < n; i++) {
			String temp = s[i];
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length()) 
			{
				s[j + 1] = s[j];
				j--;
			}
			s[j + 1] = temp;
		}
	}

	static void printArraystring(String str[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(str[i] + " ");
	}

}
