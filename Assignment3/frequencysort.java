package com.FOXMULA.ASSIGNMENT3;
import java.util.Arrays;
import java.util.Scanner;

public class frequencysort
{
	public static void main(String[] args)
	{
        Scanner s = new Scanner(System.in);

        System.out.println("enter length");
        int x = s.nextInt();
        Integer[] arr=new Integer[x];

        System.out.println("enter the string");
        for (int i = 0; i < x; i++)
        {
            arr[i]=s.nextInt();
        }
        int count = 0;
        System.out.println("enter the string to be checked");
        int y = s.nextInt();

        for (int i=0;i< arr.length;i++)
        {
           if (y==arr[i])
           {
              {
                   count++;

                }
            }

        }
        System.out.println("no. of time of occurences:" + count);
        System.out.println("sorted array is ");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

}

