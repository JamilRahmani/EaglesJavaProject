package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		
		ArrayList<Integer> numbers = new ArrayList<Integer> (Arrays.asList(1,2,3,4,2,1,5,6,7,9,8,3,5,8,4,7));
	
		//1. LinkedHashSet
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> duplicate = new ArrayList<Integer>(lhs);
		System.out.println(duplicate);
		
		// 2. JDK 8 - using steam 
		ArrayList<Integer> mark = new ArrayList<Integer> (Arrays.asList(1,2,3,4,2,1,5,6,7,9,8,3,5,8,4,7));
		
		List<Integer> dup = mark.stream().distinct().collect(Collectors.toList());
		System.out.println(dup);
		
	}

}
