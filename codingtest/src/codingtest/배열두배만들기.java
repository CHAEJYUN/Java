package codingtest;

import java.util.Arrays;

public class 배열두배만들기 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] *2;
		}
		
		System.out.println(Arrays.toString(numbers));
	}

}
