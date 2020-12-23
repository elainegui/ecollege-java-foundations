package eCollegeJava.JFT11Ex2;

public class Vehicle {
	private String manufacturer;
	private float engineSize = 0.0f;
	private String registrationNumber = "not specified";
	private boolean NCT = false;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public boolean isNCT() {
		return NCT;
	}

	public void setNCT(boolean nCT) {
		NCT = nCT;
	}

	public Vehicle(String manufacturer, float engineSize, String registrationNumber, boolean nCT) {
		super();
		this.manufacturer = manufacturer;
		this.engineSize = engineSize;
		this.registrationNumber = registrationNumber;
		NCT = nCT;
	}

	public Vehicle(String manufacturer, float engineSize, String registrationNumber) {
		super();
		this.manufacturer = manufacturer;
		this.engineSize = engineSize;
		this.registrationNumber = registrationNumber;
	}

	public Vehicle(String manufacturer, float engineSize) {
		super();
		this.manufacturer = manufacturer;
		this.engineSize = engineSize;
	}

	public Vehicle(String manufacturer) {
		super();
		this.manufacturer = manufacturer;
	}

	public Vehicle() {
		super();
	}

	public String accelerate() {
		return "Accelerating...";
	}

	public String brake() {
		return "Vehicle braking...";
	}

	@Override
	public String toString() {
		return "Manufacturer=" + manufacturer + "\nEngineSize=" + engineSize + "\nRegistrationNo=" + registrationNumber
				+ "\nNCT=" + NCT;
	}

}
