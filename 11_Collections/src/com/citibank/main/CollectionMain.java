package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		System.out.println("1. Array List");
		List<String> nameList = new ArrayList<String>();
		
		System.out.println("Name List Size::" + nameList.size());
		System.out.println("Name List::" + nameList);
		
		nameList.add("Nahida");
		nameList.add("Quaser");
		String name = new String("Alam");
		nameList.add(name);
		
		System.out.println("Name List Size::" + nameList.size());
		System.out.println("Name List::" + nameList);
		System.out.println("Name at index 2::" + nameList.get(1));
		
		nameList.remove(2);
		
		System.out.println("Name List Size::" + nameList.size());
		System.out.println("Name List::" + nameList);
		
		System.out.println("----------------------------");
		System.out.println("2.HashSet");
		Set<Integer> numberSet = new HashSet<Integer>();
		System.out.println("numberSet Size::"  + numberSet.size());
		System.out.println("numberSet::"  +  numberSet);
		
		numberSet.add(101);
		numberSet.add(121);
		numberSet.add(151);
		numberSet.add(161);
		numberSet.add(191);
		
		System.out.println("After Adding");
		System.out.println("numberSet size::"  +  numberSet.size());
		System.out.println("numberList::"  + numberSet);
		
		System.out.println("----------------------------");
		System.out.println("3.TreeSet");
		
		Set<String> nameTreeSet = new TreeSet<String>();
		System.out.println("nameTreeSet Size::"  + nameTreeSet.size());
		System.out.println("nameTreeSet::"  +  nameTreeSet);
		
		nameTreeSet.add("A");
		nameTreeSet.add("B");
		nameTreeSet.add("C");
		nameTreeSet.add("D");
		nameTreeSet.add("E");
		
		
		System.out.println("After Adding");
		
		System.out.println("nameTreeSet Size::"  + nameTreeSet.size());
		System.out.println("nameTreeSet::"  +  nameTreeSet);
						
		System.out.println("Main End");

	}

}
