package com.array;

import java.util.Scanner;
/*WAP to find third minimum number from list of numbers.*/
public class ProgramOne 
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int sizeOfArray= in.nextInt();
        int [] array = new int [sizeOfArray];
        for (int i = 0; i < array.length; i++) 
        {
            System.out.println("Enter the element of the array : "+(i+1));
            array[i]=in.nextInt();
       }



       for (int i = 0; i < array.length; i++) 
       {
            System.out.println(array[i]);
       }
        
        thirdSmallestElement(array,sizeOfArray);
   }
    
    public static void thirdSmallestElement(int [] arr,int sizeOfArray){
        
        for (int i = 0; i < sizeOfArray; i++) 
        {
            for (int j = i + 1; j < sizeOfArray; j++) 
            {
                if (arr[i] == arr[j]) 
                {
//                    System.out.println("Duplicates Elements Are :" + arr[i]);
                    arr[j] = arr[sizeOfArray - 1];
                    sizeOfArray--;
                }
            }
        }
        System.out.println("New Array Without Repeatations");
        for (int i = 0; i < sizeOfArray; i++) 
        {
            System.out.println(arr[i]);
        }
        
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

       for (int i = 0; i <sizeOfArray ; i++)
       {
            int current = arr[i];
            
            if(first > current)
            {
                third = second;
                second = first;
                first = current;
            }
            
            else if(second > current)
            {
                third = second;
                second = current;
            }
            else if(third > current)
            {
                third=current;
            }
        }
        System.out.println("Third smallest element is: " + third);
    }
}