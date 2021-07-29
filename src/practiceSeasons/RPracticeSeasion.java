package practiceSeasons;

public class RPracticeSeasion {

	public static void main(String[] args) {

		String[][][] array = new String [1][3][3];

		array[0][0][0] = "1- Virginia";
		array[0][0][1] = "Richmond";
		array[0][0][2] = "3333-3333";
		
		array[0][1][0] = "2 - Maryland";
		array[0][1][1] = "Annapolis";
		array[0][1][2] = "66666-6666";
		
		array[0][2][0] = "3- Washington DC";
		array[0][2][1] = "Washington";
		array[0][2][2] = "99999-9999";
		
		for (int i = 0; i< array.length; i++) {
			for (int j = 0; j <array[i].length;j++) {
				for (int k = 0; k< array[i][j].length; k++) {
					System.out.println(array[i][j][k]);
				}
			}
		}
		
		
		
	}

}
