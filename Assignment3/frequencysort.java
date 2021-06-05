package com.foxmula.Assignment_3;

import java.util.*;
import java.util.Map.Entry;

public class frequencysort 
{
  void frequencysort(int ar[],int size)
  {
      HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
      for(int i=0;i<size;i++)
      {
          if(hashmap.containsKey(ar[i]))
          {
              hashmap.put(ar[i],hashmap.get(ar[i])+1);
          }
          else
          {
              hashmap.put(ar[i], 1);
          }
      }
      Set<Entry<Integer,Integer>> set = hashmap.entrySet();
      List<Entry<Integer,Integer>> list = new ArrayList<>(set);
      Collections.sort(list,new Comparator<Entry<Integer,Integer>>()
      {
         public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) 
         {
             
             return o1.getValue().compareTo(o2.getValue());
         }
      }); 
      for (Map.Entry entry : hashmap.entrySet()) {
          System.out.println(entry.getKey() + " " + entry.getValue());
      }
  }
  public static void main(String[] args)
  {
      frequencysort obj=new frequencysort();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the size of the array ");
      int n=scanner.nextInt();
      int ar[]=new int[n];
      System.out.println(" ENTER THE VALUES IN THE ARRAY ");
      for(int i=0;i<n;i++)
      {
          ar[i]=scanner.nextInt();
      }
      obj.frequencysort(ar,n);
      scanner.close();
  }
}
