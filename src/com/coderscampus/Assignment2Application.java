package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int randomNumber = random.nextInt(100) + 1;
		int tries = 0;
		
		System.out.println("Guess a number between 1 and 100");
		int guessNumber = scanner.nextInt();
		
		while (tries < 5) {
			if ( guessNumber < randomNumber) {
				System.out.println("Please Pick a Higher Number" + ": ");
			} else {
				System.out.println("Please Pick a Lower Number" + ": ");
			}
			if (guessNumber == randomNumber) {
                System.out.println("Congratulations! You guessed the secret number which is: " + randomNumber);
			}
			if (guessNumber > 100) {
				System.out.println("You did not choose a number between 1 and 100: Try again");
			} else if (guessNumber < 1) {
				System.out.println("You did not choose a number between 1 and 100: Try again");
			}
			
			guessNumber = scanner.nextInt();
			tries ++;
			
			if ( tries == 5 && guessNumber != randomNumber) {
				System.out.println("You Lose! The Number was: " + randomNumber + ".");
			}
		
		}
		scanner.close();
		
	}
}
