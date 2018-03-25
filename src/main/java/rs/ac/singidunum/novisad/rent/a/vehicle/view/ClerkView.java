package rs.ac.singidunum.novisad.rent.a.vehicle.view;

import java.util.Scanner;

import rs.ac.singidunum.novisad.rent.a.vehicle.controller.ClerkController;

public class ClerkView {
	Scanner scann = new Scanner(System.in);
	private ClerkController controller;
	boolean engine = true;
	String input;

	public void setController(ClerkController clerkController) {
		this.controller = clerkController;

	}

	public void displayMenu() {
		System.out.println("Displaying Clerk UI...");
		while (engine) {
			System.out.println("1. Nesto 2. Nesto 3. Logout");
			input = scann.nextLine();
			if(input.equals("3")){
				System.out.println("Logging out...");
				return;
			}
		}
	}

}
