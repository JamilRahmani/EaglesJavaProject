package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		
		ArrayList<Integer> numbers = new ArrayList<Integer> (Arrays.asList(1,2,3,4,2,1,5,6,7,9,8,3,5,8,4,7));
		
		//1. LinkedHashSet
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(numbers);
		//HashSet<Integer> hs2 = new HashSet<Integer>(numbers);

		System.out.println(lhs);
		
		
		// 2. JDK 8 - using steam 
		ArrayList<Integer> mark = new ArrayList<Integer> (Arrays.asList(1,2,3,4,2,1,5,6,7,9,8,3,5,8,4,7));
		
		List<Integer> dup = mark.stream().distinct().collect(Collectors.toList());
		System.out.println(dup);
	
		
		HashMap<String, String> mm = new HashMap<String, String>();
		mm.put("1", "one");
		mm.put("2", "two");
		mm.put("3", "three");
		mm.put("4", "four");
		mm.put("5", "five");
		
		System.out.println(mm);
		
		
		
		List<String> sortedKeys = new ArrayList<String>(mm.size());
		sortedKeys.addAll(mm.keySet()); // This will give only the Keys by using KeyDet method.
		//sortedKeys.addAll(mm.values()); // This will give the values only by using Values method.
		//mm.values().containsAll(sortedKeys);
		System.out.println(sortedKeys);
	}

}
