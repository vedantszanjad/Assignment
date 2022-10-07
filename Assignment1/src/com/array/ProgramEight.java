package com.array;

import java.util.Scanner;

public class ProgramEight 
{
	static int k = 0;
	static int l = 0;
	public static void main(String[] args) 
	{
		int r = 0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter The Size Of An Array");
		int n = sc.nextInt();
		System.out.println("Enter The Elements In Array ch[] :");
		char ch [] = sc.next().toCharArray();
		char vowels [] = new char[n];
		char consta [] = new char[n];
		char newArray [] = new char[n];
		//Logic To Collect The Vowels And Consonants Together 
		for(int i = 0; i < n ; i++)
		{			
			
			if(ch[i] == 'a'|| ch[i] == 'e'||ch[i]== 'i'||ch[i] == 'o' ||ch[i] == 'u'||ch[i]== 'A'||ch[i] == 'E'|| ch[i] == 'I' || ch[i]== 'O'|| ch[i] == 'U')
			{
				vowels [k] = ch[i];
				k++;
				continue;
				
			}
			
			else 
			{
				consta [l] = ch[i];
				l++;
				continue;
				
			}
			 
		}
		for(int k = 0; k < n ; k++)
		{
			System.out.println("Vowels In New Array vowels [] At :"+ k +" Is "+ vowels[k]);
		}
		
		System.out.println("=============================");
		System.out.println("             ::              ");
		System.out.println("=============================");
		
		for(int l = 0; l < n ; l++)
		{
			System.out.println("Consanants In New Array consanants[] At :"+ l + " Is "+ consta[l]);
		}
		
		
		
		for(int i=0; i < n ; i++)
		{
			if(vowels [i] !='\u0000')
			{
				newArray[r] = vowels [i];
				r++;
			}
		}
		
		
		for(int i=0; i < n ; i++)
		{
			if(consta [i] != '\u0000')
			{
				
		       newArray[r] = consta [i];
		       r++;
			}
		}
		//System.out.println(r);
	//Collecting The Vowels And Consonants Together
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(int i = 0; i < n ; i++)
		{
			System.out.println("vowels In New Array newArray[] At :"+ i + " Is "+ newArray[i]);
		}
		
		}
	}

 