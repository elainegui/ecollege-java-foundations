package eCollegeJava.JFT11Ex2;

public class Car extends Vehicle {
	static int carCount = 0;

	public Car() {
		super();
		carCount++;
	}

	public Car(String manufacturer, float engineSize, String registrationNumber, boolean nCT) {
		super(manufacturer, engineSize, registrationNumber, nCT);
		carCount++;
	}

	public Car(String manufacturer, float engineSize, String registrationNumber) {
		super(manufacturer, engineSize, registrationNumber);
		carCount++;
	}

	public Car(String manufacturer, float engineSize) {
		super(manufacturer, engineSize);
		carCount++;
	}

	public Car(String manufacturer) {
		super(manufacturer);
		carCount++;
	}

	@Override
	public String brake() {
		return "Car braking...";
	}
}
