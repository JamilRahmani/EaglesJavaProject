package OOPsPractice3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class NewPractice {
    public static void main(String[] args) {
        NewPractice c = new NewPractice();
        c.booking();
        // create an arrayList and add elements to it find the elements which starts with "A"
        // and print them out
        //System.out.println(c.booking());
         ArrayList<String> list = new ArrayList<String>();
         list.add("Apple");
        list.add("Book");
        list.add("Test");
        list.add("Amazing");
        System.out.println(list);




    }
    int booking(){
        return (true? null : 0);
    }

}
