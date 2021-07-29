package practiceSeasons;

public class PracticeSeasionRamin {
	
	int z;
	

	public static void main(String[] args) {

		PracticeSeasionRamin obj = new PracticeSeasionRamin();
		
		obj.addition(10, 20);
		obj.addition(5, 20, 10);
		obj.addition(20, 50, 15, 25);
		obj.addition(5, 40, 80, 3, 9);
	}
	
	public void addition(int x, int y) {
		z = x+y;
		System.out.println("The sum is "+z);
	}
	
	public void addition(int x, int y, int k) {
		z = x + y * k;
		System.out.println("The total is "+z);
	}
	public void addition(int x, int y, int k, int a) {
		z = x + y + k + a;
		System.out.println("The total sum is " +z);
	}
	
	public int addition(int x, int y,  int k, int a, int j) {
		z = x + y + k + a + j;
		System.out.println("The sum is " +z);
		return z;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
