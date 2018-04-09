package rs.ac.singidunum.novisad.rent.a.vehicle.dao;

import java.util.Date;

import rs.ac.singidunum.novisad.rent.a.vehicle.model.Reservation;
import rs.ac.singidunum.novisad.rent.a.vehicle.model.Vehicle;

public interface RenterDAO {

	boolean makeReservation(Vehicle vehicle,Date startDate, Date endDate);
	boolean cancelReservation(Reservation reservation);
	void returnVehicle(Reservation reservation, double kilometers);
}
