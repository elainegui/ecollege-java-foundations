package eCollegeJava;

public class JFT4Ex2 {

	public static void main(String[] args) {
		double price = 14.50;
		double vatRate = 0.23;
		System.out.println("Purchase Amount: " + price);
		System.out.println("Vat Payable: " + vatRate);
		System.out.println("Toal Price" + (price - (price * vatRate)));

	}

}
