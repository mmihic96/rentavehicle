package rs.ac.singidunum.novisad.rent.a.vehicle.dao;

import rs.ac.singidunum.novisad.rent.a.vehicle.model.User;

/**
 * CREATE READ UPDATE DELETE for User objects
 * 
 * @author mmihic
 *
 */
public interface UserDAO {

	/**
	 * @param username
	 * @param password
	 * @return
	 */
	User findByUsernameAndPassword(String username, String password);
	

}
