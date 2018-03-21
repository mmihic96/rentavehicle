package rs.ac.singidunum.novisad.rent.a.vehicle.controller;

import rs.ac.singidunum.novisad.rent.a.vehicle.dao.UserDAO;
import rs.ac.singidunum.novisad.rent.a.vehicle.dao.impl.UserDAOImpl;
import rs.ac.singidunum.novisad.rent.a.vehicle.model.Clerk;
import rs.ac.singidunum.novisad.rent.a.vehicle.model.User;
import rs.ac.singidunum.novisad.rent.a.vehicle.state.ApplicationState;
import rs.ac.singidunum.novisad.rent.a.vehicle.view.LoginView;
import rs.ac.singidunum.novisad.rent.a.vehicle.view.MainView;

public class LoginController {

	UserDAO userDAO = UserDAOImpl.getInstance();
	LoginView view;

	ApplicationState applicationState = ApplicationState.getInstance();

	public LoginController() {

	}

	public void setView(LoginView loginView) {
		this.view = loginView;
	}

	public void doLogin(String username, String password) {
		User user = userDAO.findByUsernameAndPassword(username, password);
		if (user == null) {
			return;
		}

		applicationState.setLoggedUser(user);

		MainController mainController = new MainController();
		MainView mainView = new MainView();

		mainController.setView(mainView);
		mainView.setController(mainController);

		mainView.displayUI();
	}

	public void doLogout() {
		applicationState.deleteSession();
		view.printUI();
		
	}
}