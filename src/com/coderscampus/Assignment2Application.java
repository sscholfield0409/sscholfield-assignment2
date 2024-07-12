package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int randomNumber = random.nextInt(100) + 1;
		int tries = 0;


		while (tries < 5) {

			System.out.println("Guess a number between 1 and 100");
			int guess = scanner.nextInt();
			if (guess > 100 || guess < 1) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				continue;
			} else if (guess < randomNumber) {
				System.out.println("Please Pick a Higher Number" + ": ");
			} else if (guess > randomNumber) {
				System.out.println("Please Pick a Lower Number" + ": ");

			} else if (guess == randomNumber) {
				System.out.println("You Win!! The number is: " + randomNumber);
				scanner.close();
				return;
			}
			tries++;
		}

		if (tries == 5) {
			System.out.println("You Lose! The Number was: " + randomNumber);
		}

		scanner.close();
	}

}
