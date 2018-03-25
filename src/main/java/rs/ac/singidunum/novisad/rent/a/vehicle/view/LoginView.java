package rs.ac.singidunum.novisad.rent.a.vehicle.view;

import java.util.Scanner;

import rs.ac.singidunum.novisad.rent.a.vehicle.controller.LoginController;
import rs.ac.singidunum.novisad.rent.a.vehicle.state.ApplicationState;

public class LoginView {
	Scanner scanner = new Scanner(System.in);
	private LoginController controller;
	
	ApplicationState applicationState = ApplicationState.getInstance();

	public void setController(LoginController controller) {
		this.controller = controller;
	}

	public void displayLoginUI() {
			System.out.println("Enter your login information: ");
	}

	public void printError(String msg) {
		System.out.println(msg);
	}

}
