package StaticKeyword;

public class Student {
	
	private String name;
	private static int count = 0;
	public Student() {
		this.name = "";
		count++;
	}
	public Student(String name) {
		this();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getCount() {
		return count;
	}

	
	
	
	
}
