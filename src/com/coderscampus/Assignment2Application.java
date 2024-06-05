package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		
		//generate a random number
		
		//collect user input
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int randomNumber = random.nextInt(100) + 1;
		int tries = 0;
		
		System.out.println("Guess a number between 1 and 100");
		
		int guessNumber = scanner.nextInt();
		while (guessNumber != randomNumber || tries < 5) {
		
			if ( guessNumber < randomNumber) {
				System.out.println("Please Pick a Higher Number");
			} else {
				System.out.println("Please Pick a Lower Number");
			}
			
			if ( guessNumber != randomNumber && tries == 5) {
				System.out.println("You Lose! The Number was: " + randomNumber + ".");
			} else {
				System.out.println("You Win!");
			}
			
			guessNumber = scanner.nextInt();
			
			scanner.close();
			

			}

		}

	}
