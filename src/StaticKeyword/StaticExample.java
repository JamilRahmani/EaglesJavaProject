package StaticKeyword;

import java.awt.Color;
import java.util.ArrayList;

public class StaticExample {

	public static void main(String[] args) {

		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		Student st5 = new Student("Jack");
		Student st6 = new Student("khan");
		System.out.println(Student.getCount());
		System.out.println(st5.getName());

		ArrayList<String> data = new ArrayList<>();

		// 2^5 = 2 * 2 * 2 * 2 * 2
		System.out.println(toThePow(2, 5));

		System.out.println(Color.blue);

		System.out.println(Integer.MAX_VALUE);

	}

	public static int toThePow(int num, int pow) {
		int result = num;

		for (int i = 1; i < pow; i++) {
			result *= num;

		}

		return result;
	}

}
