package assignment2;

import java.util.*;

public class TreeSet {
	void addElements(TreeSet<String> sets,int n) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the elements to be inserted:");
		for (int i=0;i<n;i++)
			sets.add(scanner.nextLine());
	}
	
	void traversal(HashSet<String> sets) {

		for (String i : sets) 
            System.out.println(i); 
        
	}
	
	public static void main(String []args) {
		TreeSet<String> sets=new TreeSet();
		TraverseTreeSet hs=new TraverseTreeSet();
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the number of Elements: ");
		int n=scanner.nextInt();
		
		hs.addElements(sets, n);
		
		System.out.println("TreeSet: ");
		hs.traversal(sets);
		
	}
}
