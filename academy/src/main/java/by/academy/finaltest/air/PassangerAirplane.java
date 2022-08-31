package by.academy.finaltest.air;

public class PassangerAirplane extends Airplane {
	private int placesForPassengers;
	private double loadCapacity;

	public PassangerAirplane() {
		super();
	}

	public PassangerAirplane(String model, String brand, double rangeOfFlight,
			double fuelConsumption,int placesForPassengers,double loadCapacity) {
		super(model, brand, rangeOfFlight, fuelConsumption);
		this.placesForPassengers=placesForPassengers;
		this.loadCapacity=loadCapacity;
	}

	public int getPlacesForPassengers() {
		return placesForPassengers;
	}

	public void setPlacesForPassengers(int placesForPassengers) {
		this.placesForPassengers = placesForPassengers;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public double takeoffWeight() {
		return loadCapacity+placesForPassengers;
		
	}




}
