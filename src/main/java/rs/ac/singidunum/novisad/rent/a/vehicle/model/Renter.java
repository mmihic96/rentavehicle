package rs.ac.singidunum.novisad.rent.a.vehicle.model;

public class Renter extends User {

	private String phoneNumber;
	private String nationality;

	public Renter(String firstName, String lastName, String username, String password, Long personalNumber,
			String phoneNumber, String nationality) {
		super(firstName, lastName, username, password, personalNumber);
		this.phoneNumber = phoneNumber;
		this.nationality = nationality;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
