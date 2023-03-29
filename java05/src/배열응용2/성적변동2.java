package 배열응용2;

import java.util.Random;

public class 성적변동2 {

	public static void main(String[] args) {
		
		Random random = new Random(42);
		
		int[] n1 = new int [10000];
		int[] n2 = new int [10000];

		for (int i = 0; i < n2.length; i++) {
			n1[i] = random.nextInt(101);
			n1[2] = random.nextInt(101);
		}
		
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) {
				count1++;
			} else {
				count2++;
			}
		}
		
		System.out.println("성적이 동일한 학생 수 : " + count1 + "명");
		System.out.println("성적이 동일하지 않은 학생 수 : " + count2 + "명");

	}

}
