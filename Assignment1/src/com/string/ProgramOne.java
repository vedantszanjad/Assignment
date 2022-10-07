package com.string;

import java.util.Scanner;

public class ProgramOne 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String string1,string2;
		
		System.out.println("Enter the string 1 : ");
		string1=sc.nextLine();
		
		System.out.println("Enter the string 2");
		string2=sc.nextLine();
		
		
		char stringToChar1[]=string1.toCharArray();
		char stringToChar2[]=string2.toCharArray();
		int ind=0;
		//logic for replace char
		for(int i=0;i<stringToChar1.length;i++)
		{
			char c=stringToChar1[i];
			if(c=='a' || c=='A'|| c=='E'|| c=='e' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
			{
				try
				{
					stringToChar1[i]=stringToChar2[ind];
					ind++;
				}
				catch (StringIndexOutOfBoundsException e)
				{
					stringToChar1[i]='_';	
				}
			}

		}
		String output=new String(stringToChar1);
		System.out.println("Result String ="+output);
}
} 
