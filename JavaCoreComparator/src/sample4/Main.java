package sample4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 15, 7, 4, 9, 23, 6);
		Comparator<Integer> primeComparator = (a, b) -> {
			boolean isAPrime = isPrime(a);
			boolean isBPrime = isPrime(b);
			if (isAPrime && isBPrime) {
				return Integer.compare(b, a);
			} else if (isAPrime) {
				return -1;
			} else if (isBPrime) {
				return 1;
			} else {
				return Integer.compare(a, b);
			}
		};
		numbers.sort(primeComparator);
		Integer result = numbers.stream().filter(Main::isPrime).findFirst().orElse(numbers.get(0));

		System.out.println("Result: " + result);
	}

	private static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
