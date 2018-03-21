package rs.ac.singidunum.novisad.rent.a.vehicle.model;

/**
 * Base abstract class for common User properties...
 * 
 * @author mmihic
 *
 */
public abstract class User {

	protected String firstName;
	protected String lastName;
	private String username;
	protected String password;
	protected Long personalNumber;

	public User() {
		
	}
	public User(String firstName, String lastName, String username, String password, Long personalNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.personalNumber = personalNumber;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Long getPersonalNumber() {
		return this.personalNumber;
	}
}
