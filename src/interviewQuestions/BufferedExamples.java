package interviewQuestions;

import java.io.*;

public class BufferedExamples {
    public static void main(String[] args) {
        String [] names = {"Test1","Test2","java","Selenium"};
        //bufferWriter(names);
        bufferdReader();
    }
    public static void bufferWriter(String [] names){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("This is my first line");
            for(String s: names){
                writer.write("\n"+s);

            }
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bufferdReader(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
   

}
