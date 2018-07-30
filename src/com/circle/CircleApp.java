package com.circle;

import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String userChoice;

		System.out.println("Welcome to the circle tester!");
		do {
			try {
				System.out.println("Please enter the circle's radius: ");

				double userRadius = in.nextDouble();

				Circle circle1 = new Circle(userRadius);

				System.out.println("Circumference: " + circle1.Circumference());
				System.out.println("Area: " + circle1.getArea());
			} catch (Exception e) {
				System.out.println("Error invalid input");
			}
			System.out.println("Would you like to continue?  Yes/No");
			in.nextLine();
			userChoice = in.nextLine();
		} while (userChoice.equalsIgnoreCase("Yes"));

		in.close();
	}

}
