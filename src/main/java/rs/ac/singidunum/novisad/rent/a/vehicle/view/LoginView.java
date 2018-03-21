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

	public void printUI() {

		System.out.println("WELCOME TO RENT A VEHICLE APPLICATION");
		while (true) {
			System.out.print("Enter your login information:\n- Username: ");
			String username = scanner.nextLine();

			System.out.print("- Password: ");
			String password = scanner.nextLine();

			controller.doLogin(username, password);
			if (applicationState.getLoggedUser() != null) {
				return;
			}
			printError("Invalid username or password!");
		}

	}

	public void printError(String msg) {
		System.out.println(msg);
	}

}
