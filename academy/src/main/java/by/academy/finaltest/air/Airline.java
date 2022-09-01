package by.academy.finaltest.air;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airline {
	private String airlineName;
	private List<Airplane> listAirplane;

	public Airline() {
		super();

	}

	public Airline(String airlineName, List<Airplane> listAirplane) {
		super();
		this.airlineName = airlineName;
		this.listAirplane = listAirplane;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public List<Airplane> getListAirplane() {
		return listAirplane;
	}

	public void setListAirplane(List<Airplane> listAirplane) {
		this.listAirplane = listAirplane;
	}

	public double totalCapacity() {
		double totalCapacity = 0;
		for (Airplane plane : listAirplane) {
			totalCapacity = plane.takeoffWeight();
		}
		return totalCapacity;

	}
	 public ArrayList<Airplane> getPlaneByFuelConsumption(double fuelMin, double fuelMax) {
	        ArrayList<Airplane> filteredAirline = new ArrayList<>();
	        for (Airplane plane : listAirplane) {
	            double currentFuel = plane.getFuelConsumption();
	            if (currentFuel >= fuelMin && currentFuel <= fuelMax) {
	                filteredAirline.add(plane);
	            }
	        }
	        return filteredAirline;
	    }
	 public void sortPlane() {
		 listAirplane.sort(Comparator.comparingDouble(Airplane::getRangeOfFlight));
	 }

	@Override
	public String toString() {
		return "Airline [airlineName=" + airlineName + ", listAirplane=" + listAirplane + "]";
	}

}
