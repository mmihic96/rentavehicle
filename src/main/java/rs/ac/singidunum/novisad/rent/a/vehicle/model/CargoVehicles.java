package rs.ac.singidunum.novisad.rent.a.vehicle.model;

public class CargoVehicles extends Vehicle {

	private double maxWeight;
	private double maxHeight;

	public CargoVehicles() {

	}

	public CargoVehicles(String registrationNumber, Fuel fuel, Service[] allServices, double fuelConsumption,
			double numberOfKilometers, double numberOfKilometersBeforeService, double servicePrice, double rentPrice,
			int seatNumber, int doorNumber, boolean vehicleDeleted, double maxWeight, double maxHeight) {

		super(registrationNumber, fuel, allServices, fuelConsumption, numberOfKilometers,
				numberOfKilometersBeforeService, servicePrice, rentPrice, seatNumber, doorNumber, vehicleDeleted);
		this.maxHeight = maxHeight;
		this.maxWeight = maxWeight;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(double maxHeight) {
		this.maxHeight = maxHeight;
	}

}
