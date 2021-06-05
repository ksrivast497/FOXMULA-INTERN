package com.foxmula.Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class frequencysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers in an array");
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(hm.containsKey(arr[i])) hm.put(arr[i], hm.get(arr[i])+1);
            else hm.put(arr[i], 1);
        }
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(hm.entrySet());
        sort(l);
        
    }
    
    static void sort(List<Map.Entry<Integer, Integer>> l){
        Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> t, Map.Entry<Integer, Integer> t1) {
                return t.getValue()-t1.getValue();
            }
        });
        
        for(Map.Entry<Integer, Integer> m : l){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
        
        
    }
}

