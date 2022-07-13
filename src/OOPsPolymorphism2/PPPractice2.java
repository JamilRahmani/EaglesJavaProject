package OOPsPolymorphism2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import OOPsPractice.PPPPP;


public class  PPPractice2 extends PPPPP{
	
	public static String rev5(String m) {
		
	String [] len = m.split(" ");
		String r2 = "";
		for (int j = 0; j < len.length; j++) {
			String word = len[j];
		
		for (int i = word.length()-1; i >=0; i--) {
			r2 += word.charAt(i);
		}
		r2 += " "; 
		}
		System.out.println(r2);
		return r2;
	}
	
	
	public static void main(String[] args) {
		
		
		int x = 10;
		int x2 = 20;
		String sss = "Test";
		
		System.out.println(10+20+"Test");
		System.out.println("Test"+10+20);
	
		
		
		
		String s1 = new String ("AUTOMATION");
		String s2 = new String ("AUTOMATION");
		System.out.println(s1 == s2);

		
		String [] arrr =  {"str","test","str"};
		
		boolean duplicate = false;
		
		for (int i = 1; i < arrr.length;i++) {
			for (int j = i+1 ; j < arrr.length; j++) {
				if (arrr[i] == arrr[j]) {
					duplicate = true;
					System.out.println();
				}
				
			}
		}
		
	
	
		
		rev5("My name khan");
		
		HashSet<String> set = new HashSet();
		
		set.add("Test");
		set.add("Test1");
		set.add("Test2");
		
		for (String s : set) {
			System.out.println(s);
		}

		
		
		String str = "Cheater and who give cheat are going into the hell and it is not applying for this group";
		String [] split= str.split(" ");
		String rev = "";
		for(int i = 0; i<split.length; i++) {
			String word = split[i];
			for(int j=word.length()-1; j>=0; j--) {
				rev += word.charAt(j);
			}
			rev += " ";
		}
		System.out.println(rev);
		
	}
	
}
