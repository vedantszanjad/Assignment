package com.string;

import java.util.Scanner;

public class ProgramTwo 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String string1, subString;

		System.out.println("Enter the string 1 : ");
		string1 = sc.nextLine();

		System.out.println("Enter the string 2");
		subString = sc.nextLine();

		char stringToChar1[] = string1.toCharArray();
		char subStringToChar2[] = subString.toCharArray();

		findSubString(stringToChar1, subStringToChar2);

		if(findSubString(stringToChar1, subStringToChar2))
		{
			System.out.println("Given Sub string is present in the String");
		}
		else
		{
			System.out.println("Given Sub string is not present in the String");
		}
		
	}

	public static boolean findSubString(char[] original, char[] searchString) {
		boolean returnCode = false;; // 0-not found, -1 -error in imput, 1-found
		int counter = 0;
		int ctr = 0;
		if (original.length < 1 || (original.length) < searchString.length || searchString.length < 1) {
			returnCode = false;
		}

		while (ctr <= (original.length - searchString.length) && searchString.length > 0) {
			if ((original[ctr]) == searchString[0]) {
				counter = 0;
				for (int count = ctr; count < (ctr + searchString.length); count++) {
					if (original[count] == searchString[counter]) {
						counter++;
					} else {
						counter = 0;
						break;
					}
				}
				if (counter == (searchString.length)) {
					returnCode = true;
				}
			}
			ctr++;
		}
		return returnCode;
	}
}
