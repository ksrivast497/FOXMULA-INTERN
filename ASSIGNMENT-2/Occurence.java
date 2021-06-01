package assignment_2;
import java.util.*;

public class Occurence {
	
	public static void main(String args[])
	{
	int i,j;
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	System.out.println("Enter the length of array");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();

	for(i=0;i<n;i++)
	{
		System.out.println("Enter the Element");
		j=sc.nextInt();
		list1.add(j);
	
	}
	System.out.println("List1 is "+list1);
	
	for(i=0;i<n;i++)
	{
		if(list2.contains(list1.get(i))==false)
		{
			list2.add(list1.get(i));
		}
	}
     System.out.println("List2 is "+list2);
     
     int m=list2.size();
     int count=0;
     for(i=0;i<m;i++)
     {
    	 for(j=0;j<n;j++)
    	 {
    		 if(list2.get(i)==list1.get(j))
    			 count=count+1;
    	 }
    	 System.out.println(list2.get(i)+"-----"+count);
    	 count=0;
     }
     


}
}
