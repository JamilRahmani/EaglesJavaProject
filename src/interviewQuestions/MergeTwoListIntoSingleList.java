package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoListIntoSingleList {

	public static void main(String[] args) {

		

		  // given list 1
      List<Integer> list1 = new ArrayList<Integer>();
      list1.add(1);
      list1.add(2);
      list1.add(3);
      list1.add(4);
      
      // given list 2
      List<String> list2 = new ArrayList<String>();
      list2.add("5");
      list2.add("6");
      list2.add("7");
      list2.add("8");

      // creating new empty list
      List<Object> concatenated_list = new ArrayList<Object>();

      // using addAll( ) method to concatenate the lists
      concatenated_list.addAll(list1);
      concatenated_list.addAll(list2);

      System.out.println("list1: " + list1);
      System.out.println("list2: " + list2);
      System.out.println("Concatenated list: " + concatenated_list);
		
		
		
		
	}

}
