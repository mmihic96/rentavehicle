package rs.ac.singidunum.novisad.rent.a.vehicle.model;

public class Fuel {

	private String name;
	private double price;

	public Fuel() {

	}

	public Fuel(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
