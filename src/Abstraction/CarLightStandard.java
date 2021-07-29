package Abstraction;

public interface CarLightStandard {
	
	public final static int x = 10;
	
	public void turnOnLight();
	
	public void reverseLightSignalLight();
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public default void doSomething() {
		
	}

}
