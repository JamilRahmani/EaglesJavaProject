package javaBasics;

import java.util.Random;

public class Practiceseason {

	public static void main(String[] args) {

		int s = 1;

		while (s <= 7) {
			System.out.println(s + ": Hello ");
			s++;
		}

		System.out.println("********** Random number example *********");
		Random rand = new Random();

		int myN = 6;
		int randNum = rand.nextInt(10) + 1;
		int line = 0;

		while (randNum != myN) {
			randNum = rand.nextInt(10) + 1;

			System.out.println(++line + ". The random number is: " + randNum);

		}

		System.out.println("********** Score example *************");

		int numm = 5;
		//while (numm > 3) {
			//System.out.println(--numm + ". While loop");
	//	}
		do {
			System.out.println(++numm + ". Do-while loop");
		}while (numm < 20);
		
		int p = 81;
		while (p < 90) {
			System.out.println("you got " + p + " Still not an A, you need to put in more hours");
			p += 3;
		}

		int num = 0;
		int lines = 0;
		while (num < 10) {
			System.out.println(++lines + ". " + num++);
		}

		int num2 = 15;
		
		while (num2 > 1) {
			System.out.println(num2 -=2);
		}
		
		int number = 0;
		while (number <= 6) {
			System.out.println((number+ 1) + ". " + number++);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
	}

}
