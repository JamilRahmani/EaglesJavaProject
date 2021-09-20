package Abstraction;

public class Honda extends Car implements CarMustHave, CarLightStandard{

	
	public static void main(String[] args) {
		System.out.println(Honda.x);
		
		System.out.println(CarLightStandard.multiply(5, 5));
		
		Honda name = new Honda();
		
		System.out.println(name.calcSomeNumbers());
		
		
	}
	
	@Override
	public double calcSomeNumbers() {
		double a = 10;
		double b = 20;
		double c = a + b;
		return c;
	}

	@Override
	public void turnOnLight() {

	}

	@Override
	public double calcRate() {
		return 0;
	}
	@Override
	public void reverseLightSignalLight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void radio() {
		// TODO Auto-generated method stub
		
	}

}
