package 복습;

import java.util.Random;

public class Test {

	public static void main(String[] args) {

		Random r = new Random();
		int[] n1 = new int[1000]; // 학생 1000명의 점수
		int[] n2 = new int[1000]; // 학생 1000명의 점수
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101); // 0 ~ 100
			n2[i] = r.nextInt(101); // 0 ~ 100
		}
		int count1 = 0; // 동일한 개수 누적
		int count2 = 0; // 동일하지 않은 개수 누적
		int count3 = 0; // 2학기 성적이 더 큰 경우
		int count4 = 0; // 1학기 성적이 더 큰 경우

		for (int i = 0; i < n2.length; i++) {
			System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) {
				count1++;
			} else {
				count2++;
				if (n1[i] > n2[i]) {
					count4++;
				} else {
					count3++;
				}
			}
			System.out.println("1, 2학기 성적이 동일한 학생 수 : " + count1);
			System.out.println("1, 2학기 성적이 동일하지 않은 학생 수 : " + count2);
			System.out.println("2학기 성적이 더 오른 학생 수 : " + count3);
			System.out.println("1학기 성적이 더 오른 학생 수 : " + count4);
		}
	}

}
