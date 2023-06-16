package interviewQuestions;

public class ReplaceNumbersToStartsInString {

	public static void main(String[] args) {

		// Replace all numbers to stars
		String num = "Java1649script74p$#&hyton924";
		String replaceNumbers = num.replaceAll("[^a-zA-Z]", "");
		//String replaceNumbers = num.replaceAll("[a-z]","*" );

		System.out.println(replaceNumbers);

		//Replace all letters with stars
		String alphabhets = "Java1649script74phyton924";
		String replaceAlphabhets = alphabhets.replaceAll("[^a-z]", "*");

		System.out.println(replaceAlphabhets);


		String s = "Java$ is a programing @language";
		String rs = alphabhets.replaceAll("[^a-z]", "");

		System.out.println(rs);





	}

}
