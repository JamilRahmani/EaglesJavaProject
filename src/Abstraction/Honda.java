package Abstraction;

public class Honda extends Car implements CarMustHave, CarLightStandard{

	
	public static void main(String[] args) {
		System.out.println(Honda.x);
		
		System.out.println(CarLightStandard.multiply(5, 5));
		
		
		
	}
	
	@Override
	public double calcSomeNumbers() {
		return 0;
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
