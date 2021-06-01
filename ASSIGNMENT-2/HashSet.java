package assignment2;

import java.util.*; 
public class HashElements {
	
	public static void main(String []args) {
		HashSet<Integer> list=new HashSet<Integer>(); 
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter the number of Elements you want to insert in an set: ");
		int n=scanner.nextInt();
		
		System.out.println("Enter the elements to be inserted in an set ");
		for (int i=0;i<n;i++)
			list.add(scanner.nextInt());
		
		System.out.print("Enter the element to be searched: ");
		n=scanner.nextInt();
		

		if(!list.isEmpty() && list.contains(n)) {
			System.out.println("Element found at location "+ (list.indexOf(n)+1));
		}
		else
			System.out.println("Element not found..");
		
	}
}
