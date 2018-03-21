package rs.ac.singidunum.novisad.rent.a.vehicle.state;

import rs.ac.singidunum.novisad.rent.a.vehicle.model.User;

public class ApplicationState {
	
	static private ApplicationState instance;
	
	private User loggedUser;
	
	private ApplicationState() {
		
	}
	
	public static ApplicationState getInstance() {
		if(instance == null) {
			instance = new ApplicationState();
		}
		return instance;
	}

	public User getLoggedUser() {
		return loggedUser;
	}

	public void setLoggedUser(User loggedUser) {
		this.loggedUser = loggedUser;
	}
	
	public void deleteSession() {
		this.loggedUser = null;
	}
	
}
