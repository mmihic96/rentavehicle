package rs.ac.singidunum.novisad.rent.a.vehicle;

import java.util.Scanner;

import rs.ac.singidunum.novisad.rent.a.vehicle.controller.MainController;
import rs.ac.singidunum.novisad.rent.a.vehicle.view.MainView;

public class Main {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		boolean logged = false;
		boolean engine = true;

		MainController mainController = new MainController();
		MainView mainView = new MainView();

		mainController.setView(mainView);
		mainView.setController(mainController);

		while (engine) {
			System.out.println("***************** WELCOME TO RENT A VEHICLE APP *****************");
			System.out
					.println("IMPORTANT: If you want to exit application type '0' (zero) for username and password.\n");
			while (!logged) {
				mainView.displayLoginUI();
				System.out.println("Username - ");
				String username = scann.nextLine();
				System.out.println("Password - ");
				String password = scann.nextLine();

				if (username.equals("0") && password.equals("0")) {
					engine = false;
					System.out.println("Goodbye! Thank you for using app.");
					return;
				}

				logged = mainController.doLogin(username, password);
				if (!logged) {
					mainView.displayErrorMsg("Wrong username or password. Please try again.\n");
				}
			}
			while (logged) {
				mainView.displayLoggedUser();
				if (!mainController.checkAuth()) {
					mainView.displayErrorMsg("Sorry you are not authorized. Exiting application...");
					engine = false;
					return;
				}
				mainView.displayMenu();
				logged = false;
			}

		}

	}

}
