package eCollegeJava.JFT11Ex2;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Subaru Hatchback", 53.45f, "89C4545", true);
		System.out.println(car);
		System.out.println(car.brake());
		System.out.println(car.accelerate());

		System.out.println();

		Car car2 = new Car();
		car2.setManufacturer("Toyota Corolla");
		car2.setEngineSize(45.44f);
		car2.setRegistrationNumber("90C4343");
		car2.setNCT(true);
		System.out.println(car2);
		System.out.println(car2.brake());
		System.out.println(car2.accelerate());
		System.out.println(Car.carCount + "cars have been produced");

		System.out.println();

		Truck truck2 = new Truck("Ford Transit");
		System.out.println(truck2);
		System.out.println(truck2.brake());
		System.out.println(truck2.accelerate());

		System.out.println();

		Truck truck = new Truck();
		truck.setManufacturer("Hyundai Pick-Up");
		truck.setEngineSize(89.45f);
		truck.setRegistrationNumber("99C5344");
		truck.setNCT(true);
		System.out.println(truck);
		System.out.println(truck.brake());
		System.out.println(truck.accelerate());

	}

}
