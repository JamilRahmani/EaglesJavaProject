package OOPSSpolyExample;

public class Runner {

	public static void main(String[] args) {


		Toyota car1 = new Toyota();
		
		car1.accelarate();
		
		BMW car2 = new BMW();
		
		car2.accelarate();
		
		BMWX7 car3 = new BMWX7();
		
		car3.accelarate();
		
		Car [] data = new Car[5];
		data[0] = car1;
		data[1] = car2;
		data[2] = car3; 
		data[3] = new Car();
		data[4] = new BMW();
		
		System.out.println(data[2]);
		Object [] data2 = new Object[5];
		data2[0] = 123;
		data2[1] = 67.88;
		data2[2] = "dsfs";
		data2[3] = 'k';
		data2[4] = new Car();
		
		for(int i = 0; i < data2.length;i++) {
			System.out.println(data2[i]);
		}
	}

}
