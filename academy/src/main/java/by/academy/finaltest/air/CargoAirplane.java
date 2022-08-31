package by.academy.finaltest.air;

public class CargoAirplane extends Airplane {
	private double loadCapacity;

	public CargoAirplane() {
		super();
	}

	public CargoAirplane(String model, String brand, double rangeOfFlight,
			double fuelConsumption,double loadCapacity) {
		super(model, brand, rangeOfFlight, fuelConsumption);
		this.loadCapacity=loadCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public double takeoffWeight() {
		return loadCapacity;
		
	}


}
