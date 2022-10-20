package com.yash.programsix;

public class Vehicle {

	private String vehicleName;
	private String vehicleType;
	private String vehicleMileage;
	private long vehiclePrice;
	private Engine engine;

	public Vehicle() {

	}

	public Vehicle(String vehicleName, String vehicleType, String vehicleMileage, long vehiclePrice, Engine engine) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehicleMileage = vehicleMileage;
		this.vehiclePrice = vehiclePrice;
		this.engine = engine;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleMileage() {
		return vehicleMileage;
	}

	public void setVehicleMileage(String vehicleMileage) {
		this.vehicleMileage = vehicleMileage;
	}

	public long getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(long vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void displayVehicle() {
		System.out.println("Vehicle Type:- **************" + vehicleType + "************");
		System.out.println("Vehicle Name:-" + vehicleName);
		System.out.println("Mileage:-" + vehicleMileage);
		System.out.println("Price:-" + vehiclePrice);
		System.out.println(engine.toString());
		System.out.println("********************************************************");
		System.out.println("********************************************************");
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", vehicleType=" + vehicleType + ", vehicleMileage="
				+ vehicleMileage + ", vehiclePrice=" + vehiclePrice + ", engine=" + engine + "]";
	}

}
