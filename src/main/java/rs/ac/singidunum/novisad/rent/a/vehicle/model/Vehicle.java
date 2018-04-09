package rs.ac.singidunum.novisad.rent.a.vehicle.model;

public class Vehicle {

	private String registrationNumber;
	private Fuel fuel;
	private Service allServices[];
	private double fuelConsumption;
	private double numberOfKilometers;
	private double numberOfKilometersBeforeService;
	private double servicePrice;
	private double rentPrice;
	private int seatNumber;
	private int doorNumber;
	private boolean vehicleDeleted;

	public Vehicle() {
		
	}

	public Vehicle(String registrationNumber, Fuel fuel, Service[] allServices, double fuelConsumption,
			double numberOfKilometers, double numberOfKilometersBeforeService, double servicePrice, double rentPrice,
			int seatNumber, int doorNumber, boolean vehicleDeleted) {
		this.registrationNumber = registrationNumber;
		this.fuel = fuel;
		this.allServices = allServices;
		this.fuelConsumption = fuelConsumption;
		this.numberOfKilometers = numberOfKilometers;
		this.numberOfKilometersBeforeService = numberOfKilometersBeforeService;
		this.servicePrice = servicePrice;
		this.rentPrice = rentPrice;
		this.seatNumber = seatNumber;
		this.doorNumber = doorNumber;
		this.vehicleDeleted = vehicleDeleted;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Service[] getAllServices() {
		return allServices;
	}

	public void setAllServices(Service[] allServices) {
		this.allServices = allServices;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public double getNumberOfKilometers() {
		return numberOfKilometers;
	}

	public void setNumberOfKilometers(double numberOfKilometers) {
		this.numberOfKilometers = numberOfKilometers;
	}

	public double getNumberOfKilometersBeforeService() {
		return numberOfKilometersBeforeService;
	}

	public void setNumberOfKilometersBeforeService(double numberOfKilometersBeforeService) {
		this.numberOfKilometersBeforeService = numberOfKilometersBeforeService;
	}

	public double getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public boolean isVehicleDeleted() {
		return vehicleDeleted;
	}

	public void setVehicleDeleted(boolean vehicleDeleted) {
		this.vehicleDeleted = vehicleDeleted;
	}
	
	
}
