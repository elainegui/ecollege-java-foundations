package eCollegeJava;

public class Z {

	public static void main(String[] args) {
		// 1 000 000 000
		// 4
		// 1 000 000 000 0000
		// 10 0000

		// 10 0000 / 10000
		Money money = new Money(1234567890L, 4L);
		System.out.println(money.print());

	}

	static class Money {
		private Long value;
		private Long decimalPoints;

		public Money(Long value, Long decimalPoints) {
			this.value = value;
			this.decimalPoints = (long) Math.pow(10, decimalPoints);
		}

		public Double print() {
			return (double) (value / decimalPoints);
		}
	}

}
