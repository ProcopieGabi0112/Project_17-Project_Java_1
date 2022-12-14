package com.restaurant;// Restaurant Homework
// Instructor-provided code; do not modify.

/**
 * This class contains the main method to run the overall program.
 */
public class RestaurantMain {
	public static void main(String[] args) {
		// read restaurant data and then show main menu
		com.restaurant.RestaurantTextUI textUI = new com.restaurant.RestaurantTextUI();
		if (textUI.readRestaurantData()) {
			textUI.mainMenu();
			System.out.println();
			System.out.println("Goodbye!");
		} else {
			System.out.println("Exiting.");
		}
	}
}
