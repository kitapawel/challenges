package com.kita.codingchallenges;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromSortedLinkedList {

	public static void main(String[] args) {
	List<Integer> sortedList = new LinkedList<>();
	
	sortedList.add(1);
	sortedList.add(1);
	sortedList.add(4);
	sortedList.add(6);
	sortedList.add(6);
	sortedList.add(6);
	sortedList.add(7);
	sortedList.add(8);
	sortedList.add(8);
	sortedList.add(8);
	sortedList.add(8);
	sortedList.add(9);
	sortedList.add(9);
	
	System.out.println("List with duplicates: " + sortedList);
	
	HashSet<Integer> hs = new HashSet<Integer>();
	
	for (int i : sortedList) {
		hs.add(i);
	}
	
	sortedList.removeAll(sortedList);
	System.out.println("Sorted list after removal: " + sortedList);
	
	for (int i : hs) {
		sortedList.add(i);
	}
	
	System.out.println("Sorted list without duplicates: " + sortedList);
	
	}
	
}
