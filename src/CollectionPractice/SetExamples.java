package CollectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {

		// it only takes unique value
		// HashSet is not ordered based on the order you add values

		HashSet<Integer> data = new HashSet<Integer>();

		System.out.println(data.add(1));
		System.out.println(data.add(22));
		System.out.println(data.add(1));
		System.out.println(data);

		for (Integer i : data) {
			System.out.println(i);
		}

		// example of using HashSet
		// finding duplicates in a array

		List<String> values = new ArrayList<String>();
		values.add("test");
		values.add("test1");
		values.add("test2");
		values.add("test2");
		values.add("test3");
		System.out.println(values);

		// we are going to use HashSet to find duplicates in this list
		// 1. we need to create a HashSet
		// 2. We need to loop through the list of data
		// 3. we need to add each index to the set and verify the return of the method
		// add
		// if the method add returns false, it means that the item already exists

		Set<String> tempSet = new HashSet<String>();

		for (int i = 0; i < values.size(); i++) {
			if (tempSet.add(values.get(i))) {
				// we are good, this element is not duplicate
			} else {
				// the element we added already exist and its a duplicate
				System.out.println("Duplicate item " + values.get(i));
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
