package rs.ac.singidunum.novisad.rent.a.vehicle;

import rs.ac.singidunum.novisad.rent.a.vehicle.controller.LoginController;
import rs.ac.singidunum.novisad.rent.a.vehicle.view.LoginView;

public class Main {

	public static void main(String[] args) {
		LoginController controller = new LoginController();
		LoginView view = new LoginView();
		
		controller.setView(view);
		view.setController(controller);
		
		view.printUI();

	}

}
