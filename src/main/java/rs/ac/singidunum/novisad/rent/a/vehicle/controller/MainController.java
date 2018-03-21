package rs.ac.singidunum.novisad.rent.a.vehicle.controller;

import java.util.Scanner;

import rs.ac.singidunum.novisad.rent.a.vehicle.view.MainView;

public class MainController extends LoginController{
	Scanner scann = new Scanner(System.in);
	private MainView view;

	public void setView(MainView mainView) {
		this.view = mainView;

	}

	public void getClerkOption() {
		while(true) {
			view.printClerkMenu();

			String input = scann.nextLine();
			switch(input) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				doLogout();
				return;
			}
		}
	}

}
