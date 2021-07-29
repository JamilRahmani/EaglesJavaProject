package javabasics_iterations;

import java.util.Random;

public class WhileLoop {

	public static void main(String[] args) {

		// int x = 1;

		// while (x <= 10) {
		// System.out.println(x);
		// ++x;
		// }

		char character = 'a';

		while (character <= 'z') {
			System.out.println((int) character++);
		}

		System.out.println("End program");

		// generate a random number between 1- 10
		System.out.println("********** Random number*************");
		Random rand = new Random();
		int myNum = 5;
		int randNum = rand.nextInt(10) + 1; // <<< Create a random number from 1 -10

		int line = 0;
		while (randNum != myNum) { // <<<< stop when my myNum matches random
			randNum = rand.nextInt(10) + 1; // <<<< generate a new random number 1- 10
			System.out.println(++line + ". The random number is " + randNum);// << print
		}

		// score example
		System.out.println("************* score example *********");

		int score = 50;

		while (score < 90) {
			System.out.println("you got " + score + " still not an A, you need to put in more hours");
			score += 3;

		}

		// - with post the answer wwill be 7, 6, 5, 4
		// +
		int num = 3;
		/*
		 * while (num1 > 3) { System.out.println(num1-- + " "); }
		 */
		while (num > 3) {
			System.out.println(--num + "while loop ");
		}
        // Do loop
		do {
			System.out.println(--num + " do - while loop ");
		} while (num > 3);

		int number = 0;

		while (number <= 9) {
			System.out.println((number + 1) + ". the number is " + number++);

			int num2 = 0;

			while (num2 < 10) {
				System.out.println(++num2);
			}

			int num3 = 15;

			while (num3 > 1) {
				System.out.println(num3 -= 2);
			}

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
