package Abstraction;

public interface CarLightStandard {
	
	public final static int x = 10;
	
	// we can use abstract keyword in interface too its optional
	public abstract void turnOnLight();
	
	
	public void reverseLightSignalLight();
	
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public default void doSomething() {
		
	}

}
