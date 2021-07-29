package ReviewPackage;

import java.util.HashSet;
import java.util.Iterator;

public class ReveiwLoopingExamples {

	public static void main(String[] args) {

		
		int x = 1;
		
		while (x<20) {
			System.out.println(x++);
		}
		
		int [] data = {5,4,5,6,6};
		
		HashSet<Integer> temp = new HashSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			if (!temp.add(data[i])) {
				System.out.println("duplicate");
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = i +1; j < data.length; j++) {
				if (data[i] == data[j] ) {
					System.out.println("duplicate" + data[i] +"(" + i + " "+ j+")");
				}
			}
		}
		
		
	}

}
