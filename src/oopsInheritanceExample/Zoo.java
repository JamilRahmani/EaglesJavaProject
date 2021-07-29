package oopsInheritanceExample;

public class Zoo {

	public static void main(String[] args) {

		Animal obj = new Animal("Alphi ", 5, 4);

		System.out.println(obj);

		Mammals obj2 = new Mammals("King", 2, 7, "Brown", "Black");
		
		System.out.println(obj2);

		Birds obj3 = new Birds("Pirate", 2, 5, true);
		
		System.out.println(obj3);
		
		
	}

}
