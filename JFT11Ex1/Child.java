package eCollegeJava.JFT11Ex1;

public class Child extends Human {
	private String schoolCardNo;

	public Child(String name, int age, String gender, float height, float weight, String schoolCardNo) {
		super(name, age, gender, height, weight);
		this.schoolCardNo = schoolCardNo;
	}

	public String getSchoolCardNo() {
		return schoolCardNo;
	}

	public void setSchoolCardNo(String schoolCardNo) {
		this.schoolCardNo = schoolCardNo;
	}

	@Override
	public String swim() {
		if (super.getAge() <= 5) {
			return "As the child is 5 years old or younger, armbands must be worn and\r\n"
					+ "parental supervision is required. \nArms rotating and pushing the body forward…";
		} else {
			return super.swim();
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nSchoolCardNo : " + schoolCardNo;
	}

}
