package eCollegeJava.JFT11Ex2;

public class Truck extends Vehicle {
	private boolean isTrailer = false;

	public Truck(String manufacturer) {
		super(manufacturer);
	}

	public Truck() {
		super();
	}

	public boolean isTrailer() {
		return isTrailer;
	}

	public void setTrailer(boolean isTrailer) {
		this.isTrailer = isTrailer;
	}

	@Override
	public String toString() {
		return super.toString() + "\nHas Trailer? " + isTrailer;
	}

	@Override
	public String brake() {
		return "Truck Braking...";
	}

}
