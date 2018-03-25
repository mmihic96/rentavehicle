package rs.ac.singidunum.novisad.rent.a.vehicle.controller;

import rs.ac.singidunum.novisad.rent.a.vehicle.dao.UserDAO;
import rs.ac.singidunum.novisad.rent.a.vehicle.dao.impl.UserDAOImpl;
import rs.ac.singidunum.novisad.rent.a.vehicle.model.User;
import rs.ac.singidunum.novisad.rent.a.vehicle.state.ApplicationState;
import rs.ac.singidunum.novisad.rent.a.vehicle.view.LoginView;

public class LoginController {

	UserDAO userDAO = UserDAOImpl.getInstance();
	LoginView view;

	ApplicationState applicationState = ApplicationState.getInstance();

	public LoginController() {

	}

	public void setView(LoginView loginView) {
		this.view = loginView;
	}

	public boolean doLogin(String username, String password) {
		User user = userDAO.findByUsernameAndPassword(username, password);
		if (user == null) {
			return false;
		}
		applicationState.setLoggedUser(user);
		return true;
	}

}