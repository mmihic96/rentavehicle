package rs.ac.singidunum.novisad.rent.a.vehicle.model;

import java.util.Date;

public class Reservation {

	private User user;
	private Vehicle vehicle;
	private double price;
	private Date startDate;
	private Date endDate;
	private boolean deleted;
	
	public Reservation() {
		
	}

	public Reservation(User user, Vehicle vehicle, double price, Date startDate, Date endDate, boolean deleted) {
		super();
		this.user = user;
		this.vehicle = vehicle;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.deleted = deleted;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	
}
