package interviewQuestions;

public class DuplicateInArray {

	public static void main(String[] args) {

		// Shifting concept
		int[] data = { 1, 58, 1, 1 };
	//	int[] data2 = new int[data.length];
		int count = 0;
		boolean duplicate = false;

		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] == data[j]) {
					System.out.println("indexs " + i + " and " + j + " contain duplicate values " + data[i]);
				}
			}
//			if (duplicate == false) {
//				data2[i] = data[i];
//			}
//			duplicate = false;

		}

//		for (int i = 0; i < data.length; i++) {
//			System.out.println(data2[i]);
//		}
		//System.out.print(duplicate);

	}

}
