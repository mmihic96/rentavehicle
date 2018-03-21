package rs.ac.singidunum.novisad.rent.a.vehicle.dao.impl;

import java.util.ArrayList;
import java.util.List;

import rs.ac.singidunum.novisad.rent.a.vehicle.dao.UserDAO;
import rs.ac.singidunum.novisad.rent.a.vehicle.model.Clerk;
import rs.ac.singidunum.novisad.rent.a.vehicle.model.Renter;
import rs.ac.singidunum.novisad.rent.a.vehicle.model.User;

public class UserDAOImpl implements UserDAO {

	static private UserDAOImpl instance;
	List<User> allUsers = new ArrayList<>();

	private UserDAOImpl() {

	}

	public static UserDAO getInstance() {
		if (instance == null) {
			instance = new UserDAOImpl();
		}
		return instance;
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		getAllUsers();
		for (User user : allUsers) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	private void getAllUsers() {
		allUsers.add(new Clerk("Milos", "Mihic", "mmihic", "1234", 1506996121679l));
		allUsers.add(new Renter("Aleksandra", "Krsic", "akrsic", "1234", 1506996121679l, "15616516", "SERBIAN"));

	}

}
