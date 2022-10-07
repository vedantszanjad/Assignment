package com.string;

import java.util.Scanner;

public class ProgramFive 
{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the how many name of person would you like to add ?");
		int sizeOfPersonList = in.nextInt();
		String[] listOfName = new String[sizeOfPersonList];
//Storing The Name Of Person In A Array
		for (int i = 0; i < sizeOfPersonList; i++) 
		{
			System.out.println("Enter the name of the person : " + (i + 1));
			String name = in.next();
			char[] nameToChar = name.toCharArray();
			listOfName[i] = name;
		}
//Arranging The Name of Person In Ascending Order on The Basis Of Their length
		for (int i = 0; i < sizeOfPersonList; i++) {
			for (int j = i + 1; j < sizeOfPersonList; j++) {
				if (listOfName[i].toCharArray().length > listOfName[j].toCharArray().length) {
					String temp = listOfName[i];
					listOfName[i] = listOfName[j];
					listOfName[j] = temp;
				}
			}

		}

		System.out.println("Sorted names are : ");
		//Printing The Name According To Their Length
		for (int i = 0; i < sizeOfPersonList; i++) 
		{

			System.out.println(listOfName[i] + " "+listOfName[i].length());
		}

	}

}
