package challenges_gs_24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JosephusProblem_006 {

	public static void main (String[] args) {

		int size = 6;
		int step = 2;
		step--;
		int index = 0;
		
		List<Integer> people = new ArrayList<Integer>();
		
		for (int i = 0; i < size; i++) {
			people.add(i+1);
		}
		

		solution(people, step, index);
		
	}
	
	static void solution(List<Integer> people, int step, int index) {
		
		if (people.size() == 1) {
			System.out.println("Person that will survive: " + people.get(0));
			return;
		}
		
	    index = ((index + step) % people.size());
	    
	    System.out.println("Index to remove: " + index + ", which is person number: " + (index+1));
	    people.remove(index);
		System.out.println(people);
	    solution(people, step, index);
	}	
}
