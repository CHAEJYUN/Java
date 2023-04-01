package 배열기본;

import java.util.Random;

public class 많은양만들기 {

	public static void main(String[] args) {

		int[] jjj = new int[999]; //배열 크기 먼저

		//0만 999개 출력
		for (int x : jjj) {
			System.out.println(x);
		}

		System.out.println("======================="); // 구분선

		Random random = new Random();
//		int data = random.nextInt(4)+ 1; // 0 ~ 3 => 1 ~ 4
//		System.out.println(data);

		// 배열 크기 999에 1 ~ 4의 랜덤 값을 넣어준다
		for (int i = 0; i < jjj.length; i++) {
			jjj[i] = random.nextInt(4) + 1; // 0 ~ 3 => 1 ~ 4
		}

		// 넣어준 값 다 찍어 본다
		for (int i : jjj) {
			System.out.println(i);
		}
	}

}
