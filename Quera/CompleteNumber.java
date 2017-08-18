public class CompleteNumber {
	public static void main(String[] args) {
		for (int i = 1; i < 10000; i++) {
			completeNumber(i);
		}
	}

	public static void completeNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number/2; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		if(sum == number) {
			System.out.println(number);
		}
	}
}