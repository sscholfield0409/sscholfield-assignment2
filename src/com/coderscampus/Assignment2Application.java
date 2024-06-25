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
			
		
		            System.out.print("Enter a number between 1 and 10: ");
		            String input = scanner.nextLine();

		            try {
		                int num = Integer.parseInt(input);
		                if (num >= 1 && num <= 10) {
		                    System.out.println("Valid input: " + num);
		                    tries++;
		                    break; // exit loop after valid input
		                } else {
		                    System.out.println("Invalid input. Please try again.");
		                }
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input. Please try again.");
		            }
		        }

		    
	
			if ( tries == 5 && guessNumber1 != randomNumber) {
				System.out.println("You Lose! The Number was: " + randomNumber + ".");
			}
		
	
		}
		
	}

	
	

