package eCollegeJava.JFT11Ex1;

public class Baby extends Human {
	private boolean isTeething;

	public Baby(String name, int age, String gender, float height, float weight, boolean isTeething) {
		super(name, age, gender, height, weight);
		this.isTeething = isTeething;
	}

	@Override
	public String sleep() {
		if (isTeething == true) {
			return "Baby having difficulty sleeping due to teething pain.";
		}
		return super.sleep();
	}

	@Override
	public String swim() {
		return "A baby cannot swim safely...";
	}

	@Override
	public String toString() {
		return super.toString() + "\nTeething: " + isTeething;
	}

}
