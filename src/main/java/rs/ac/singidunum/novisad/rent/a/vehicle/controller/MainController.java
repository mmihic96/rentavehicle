package rs.ac.singidunum.novisad.rent.a.vehicle.controller;

import java.util.Scanner;

import rs.ac.singidunum.novisad.rent.a.vehicle.model.User;
import rs.ac.singidunum.novisad.rent.a.vehicle.state.ApplicationState;
import rs.ac.singidunum.novisad.rent.a.vehicle.view.MainView;

public class MainController {
	Scanner scann = new Scanner(System.in);
	LoginController loginController = new LoginController();
	ApplicationState applicationState = ApplicationState.getInstance();
	User loggedUser;

	private MainView view;

	public void setView(MainView mainView) {
		this.view = mainView;
	}

	public boolean doLogin(String username, String password) {
		return loginController.doLogin(username, password);
	}

	public boolean checkAuth() {
		loggedUser = applicationState.getLoggedUser();
		String className = loggedUser.getClass().getSimpleName();
		if (className.equals("Clerk") || className.equals("Renter")) {
			return true;
		}
		return false;
	}

}
