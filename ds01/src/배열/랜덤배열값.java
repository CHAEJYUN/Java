package 배열;

import java.util.Random;

public class 랜덤배열값 {

	public static void main(String[] args) {
		
		Random r = new Random(100);
		
		int[] number = new int[1000];

		//집어넣기
		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(101); 
		}
		//출력하기
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ": " + number[i]);
		}
	}

}
