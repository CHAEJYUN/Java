package codingtest;

public class 배열자르기 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(numbers[i]);
		}
	}

}
