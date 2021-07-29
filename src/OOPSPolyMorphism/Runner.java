package OOPSPolyMorphism;

public class Runner {

	public static void main(String[] args) {

		
		Parent objP = new Parent();
		System.out.println("Class Parent Object: ");
		objP.printMessage();
		
		
		ChildA objA = new ChildA();
		System.out.println("Class A Object: ");
		objA.printMessage();
		
		
		ChildB objB = new ChildB();
		System.out.println("Class B Object: ");
		objB.printMessage();
		
	}
		
	

}
