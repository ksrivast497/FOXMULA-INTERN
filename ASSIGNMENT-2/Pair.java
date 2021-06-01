package assignment2;
import java.util.*;

public class ArrayPair {
	void addElements(ArrayList<Integer> list,int n){
		Scanner scanner= new Scanner(System.in);
		
		
		System.out.println("Enter the elements: ");
		for (int i=0;i<n;i++)
			list.add(scanner.nextInt());
		
	}
	
	void checkOccurence(int n) {
		
	}
	
	void findpairs(ArrayList<Integer> list,int k) {
		HashMap<Integer,Integer> pair = new HashMap<Integer, Integer>();
		
		int count=0;
		for(int i: list)
			for(int j: list.subList(list.indexOf(i)+1,list.size()))
				if(i+j==k && !pair.containsKey(i) && !pair.containsValue(j)) 
					pair.put(i,j);
		
			for (HashMap.Entry<Integer, Integer> i:pair.entrySet()) 
				System.out.println("Pair "+(++count)+": ("+i.getKey()+","+i.getValue()+")");
		
			if(count==0)
				System.out.println("No pairs found..");
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the number of Elements: ");
		int n=scanner.nextInt();
		
		ArrayListPair arr=new ArrayListPair();
		arr.addElements(list, n);
    
		System.out.println("Enter the sum ");
		int k=scanner.nextInt();
		
		arr.findpairs(list, k);
	}

}
