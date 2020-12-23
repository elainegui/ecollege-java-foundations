package eCollegeJava.JFT11Ex1;

public class Adult extends Human {
	private String ppsNo;
	private String occupation;
	private boolean isMarried;
	private boolean isCarOwner;

	public Adult(String name, int age, String gender, float height, float weight, String ppsNo, String occupation,
			boolean isMarried, boolean isCarOwner) {
		super(name, age, gender, height, weight);
		this.ppsNo = ppsNo;
		this.occupation = occupation;
		this.isMarried = isMarried;
		this.isCarOwner = isCarOwner;
	}

	public String getPpsNo() {
		return ppsNo;
	}

	public void setPpsNo(String ppsNo) {
		this.ppsNo = ppsNo;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public boolean isCarOwner() {
		return isCarOwner;
	}

	public void setCarOwner(boolean isCarOwner) {
		this.isCarOwner = isCarOwner;
	}

	public String drive() {
		return "Driving a car safely...";
	}

	public String procreate() {
		return "procreating...";
	}

	@Override
	public String toString() {
		return super.toString() + "\nPPSNo: " + ppsNo + "\nOccupation: " + occupation + "\nMarriage Status: "
				+ isMarried + "\nCar Owner: " + isCarOwner;
	}

}
