package rs.ac.singidunum.novisad.rent.a.vehicle.dao;

import java.util.Date;

import rs.ac.singidunum.novisad.rent.a.vehicle.model.Vehicle;

public interface VehicleDAO {

	double calculateCostPerKilometer(double kilometers);
	double calculateNextService(double kilometersFromLastService, double allKilometers);
	Vehicle findVehicle(Date startDate, Date endDate, double kilometers);
	
}
