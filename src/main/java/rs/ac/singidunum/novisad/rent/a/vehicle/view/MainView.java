package rs.ac.singidunum.novisad.rent.a.vehicle.view;

import rs.ac.singidunum.novisad.rent.a.vehicle.controller.ClerkController;
import rs.ac.singidunum.novisad.rent.a.vehicle.controller.LoginController;
import rs.ac.singidunum.novisad.rent.a.vehicle.controller.MainController;
import rs.ac.singidunum.novisad.rent.a.vehicle.model.User;
import rs.ac.singidunum.novisad.rent.a.vehicle.state.ApplicationState;

public class MainView {

	private MainController controller;

	ApplicationState applicationState = ApplicationState.getInstance();
	User loggedUser;

	// LOGIN import
	LoginView loginView = new LoginView();

	// Clerk import
	ClerkView clerkView = new ClerkView();
	ClerkController clerkController = new ClerkController();

	/**
	 * 
	 */
	public void displayLoggedUser() {
		loggedUser = applicationState.getLoggedUser();
		System.out.println("Logged user - " + loggedUser.getFirstName() + " " + loggedUser.getLastName());
	}

	/**
	 * 
	 * @param mainController
	 */
	public void setController(MainController mainController) {
		this.controller = mainController;
	}

	/**
	 * 
	 */
	public void displayLoginUI() {
		loginView.displayLoginUI();
	}

	/**
	 * 
	 */
	public void displayMenu() {
		loggedUser = applicationState.getLoggedUser();
		String className = loggedUser.getClass().getSimpleName();
		if (className.equals("Clerk")) {
			clerkView.setController(clerkController);
			clerkView.displayMenu();
		} else if (className.equals("Renter")) {
			System.out.println("Displaying renter UI...");
		}
	}

	public void displayErrorMsg(String string) {
		System.out.println(string);
	}

}
