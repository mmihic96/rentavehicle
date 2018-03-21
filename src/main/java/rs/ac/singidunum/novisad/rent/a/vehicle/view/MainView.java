package rs.ac.singidunum.novisad.rent.a.vehicle.view;

import rs.ac.singidunum.novisad.rent.a.vehicle.controller.MainController;
import rs.ac.singidunum.novisad.rent.a.vehicle.model.User;
import rs.ac.singidunum.novisad.rent.a.vehicle.state.ApplicationState;

public class MainView {

	private MainController controller;

	ApplicationState applicationState = ApplicationState.getInstance();
	User loggedUser = applicationState.getLoggedUser();

	public void displayLoggedUser() {

		System.out.println("Logged user - " + loggedUser.getFirstName() + " " + loggedUser.getLastName());

	}

	public void setController(MainController mainController) {
		this.controller = mainController;

	}

	public void displayUI() {
		displayLoggedUser();
		System.out.println("");
		if (loggedUser.getClass().getSimpleName().equals("Clerk")) {
			controller.getClerkOption();
		} else if (loggedUser.getClass().getSimpleName().equals("Renter")) {
			System.out.println("RENTER");

		}
	}

	public void printClerkMenu() {
		System.out.println("1. Add new vehicle\t\t\t2. Delete vehicle\t\t\t3. Logout");
		
	}
	
	public void printRenterMenu() {
		
	}
}
