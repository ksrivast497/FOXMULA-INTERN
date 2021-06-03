package com.FOXMULA.ASSIGNMENT3;

public class oddprime
{
	
	    static boolean primenumber(int n)
	    {

	        for(int i=1;i*i<=n;i++)
	        {
	            if (n%i==0)
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	    static void oddprime(int n) throws ExceptionHandelingClass
	    {
	        if((primenumber(n) && n%2!=0))
	        {
	            throw new ExceptionHandelingClass("Number Given is an Odd and prime no: " + n);
	        }
	        else
	        {
	            System.out.println("Number is not a odd and prime no");
	        }
	    }
	


}
