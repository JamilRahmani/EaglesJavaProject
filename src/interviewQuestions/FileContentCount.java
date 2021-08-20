package interviewQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {
	
	
	static String path = "C:/Users/MSelk/OneDrive/Documents/Content Count.txt";
	
	public static void main(String[] args) {

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String currentLine = reader.readLine().trim();
			
			while (currentLine !=null) {
				lineCount++;
				
				//Words:
				String words [] = currentLine.split(" ");
				wordCount = wordCount + words.length;
				
				//Line
				for (String word : words) {
					charCount = charCount + word.length();
					
				}
				currentLine = reader.readLine();
				
			}
			
			System.out.println("Total lines: "+ lineCount);
			System.out.println("Total words: "+ wordCount);
			System.out.println("Total Chars: "+ charCount);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
		
	}

}
