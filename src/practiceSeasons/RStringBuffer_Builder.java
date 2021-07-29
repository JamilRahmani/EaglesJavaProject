package practiceSeasons;

public class RStringBuffer_Builder {

	public static void main(String[] args) {

		// Literal String/object
		String passWord = "123Richmond";
		// two months
		passWord = "456NewYork";
		String[] passWord2 = { "999LasVegas" };
		passWord2[0] = "888Denver";
		String cityName = "Lincoln ";
		String trimCityName = cityName.trim();
		String alpha = "";
		for (char current = 'a'; current <= 'z'; current++) {
			alpha += current;
		}
		System.out.println(alpha);
		
		
		StringBuilder alpha2 = new StringBuilder();
		for (char current2 = 'a'; current2 <= 'z'; current2++) {
			alpha2.append(current2);
		}
		System.out.println(alpha2);
		
		// default size/capacity for a StringBuilder is 16
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("My Java Code");
		StringBuilder sb3 = new StringBuilder(6);
		String name = "Ahmad";
		name += "Jamal";
		System.out.println(name);
		
		
		StringBuilder sb11 = new StringBuilder("Java");
		sb11.append("+SQL:");
		System.out.println(sb11);
		sb11.insert(8, 'C');
		System.out.println(sb11);
		sb11.delete(0, 4);
		System.out.println(sb11);
		
		
		// Reverse a String
		String className = "Eagles";
		for (int i = className.length() - 1; i >= 0; i--) {
			System.out.print(className.charAt(i));
		}
		System.out.println();
		
		
		// Reverse a String using StringBuilder
		StringBuilder sb21 = new StringBuilder("Selenium");
		sb21.reverse();
		System.out.println(sb21);
		
		System.out.println(new StringBuilder("I like Sandwitches").reverse());
		
		
		String name1 = "My name is Alexander. My salary is $8000 a month";
		String name2 = name1.replace('A', 'B');
		System.out.println(name2);
		String name3 = name1.replace("My", "You");
		System.out.println(name3);

		// regex Regular Expression
		String name4 = name1.replaceAll("[a-zA-Z0-9 .$]", "");
		System.out.println(name4);
		
		String name5 = name1.replaceFirst("[a-zA-Z]", "");
		System.out.println(name5);
		
		String name11 = new String("Java");
		String name21 = name11;
		String name31 = name11.intern();
		
		System.out.println(name31);
		System.out.println(name11 == name21);
		System.out.println(name11.equals(name31));
		
		
		String str1 = "Selenium";
		String str2 = str1;
		String str3 = str1.intern();
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str3));

	}

}
