package interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortedByKeysOrValues {

	public static void main(String[] args) {

		
		// sorted by only keys no value
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
