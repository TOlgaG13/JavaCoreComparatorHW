package sample2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(-5, 1, 2, -4, -1, -1, 3);
		numbers.sort(Comparator.comparingInt((Integer a) -> Math.abs(a)).thenComparingInt(a -> a > 0 ? -1 : 1));
		System.out.println(numbers.get(0));
	}

}
