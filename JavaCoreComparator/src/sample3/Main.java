package sample3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(46,506, 324, 809, 12, 123, 57);
		 Comparator<Integer> sumFirstLastComparator = (a, b) -> {
	            int sumA = sumOfFirstAndLastNum(a);
	            int sumB = sumOfFirstAndLastNum(b);
	            return Integer.compare(sumA, sumB); 
	        };
	        numbers.sort(sumFirstLastComparator);
	        System.out.println(numbers);
    }
	private static int sumOfFirstAndLastNum(int number) {
        String numStr = String.valueOf(Math.abs(number)); 
        int firstNum = Character.getNumericValue(numStr.charAt(0));
        int lastNum = Character.getNumericValue(numStr.charAt(numStr.length() - 1)); 
        return firstNum + lastNum;
    }
}