package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int randomNumber = random.nextInt(100) + 1;
		int tries = 1;
		
		
		System.out.println("Guess a number between 1 and 100");
		int guessNumber1 = scanner.nextInt();

while (true) {
			
			if ( guessNumber1 < randomNumber) {
				System.out.println("Please Pick a Higher Number" + ": ");
			} else if ( guessNumber1 > randomNumber) {
				System.out.println("Please Pick a Lower Number" + ": ");
			}
			
			guessNumber1 = scanner.nextInt();
			tries ++;
			
			if (guessNumber1 == randomNumber && tries <= 5) {
                System.out.println("Congratulations! You guessed the secret number which is: " + randomNumber);
                break;
			}
			
			if (guessNumber1 > 100 || guessNumber1 < 1) {
				System.out.println("Invalid Entry: You did not choose a number between 1 and 100: Try again");
				continue;
			} 
			
			guessNumber1 = scanner.nextInt();
	
			if ( tries == 5 && guessNumber1 != randomNumber) {
				System.out.println("You Lose! The Number was: " + randomNumber + ".");
			}
		
	
		}
		
		scanner.close();
	}
}
