package 배열기본;

import java.util.Random;

public class 많은양만들기2 {

	public static void main(String[] args) {
		
		int[] score = new int[100];
		
		Random r = new Random(42);
		
		//2 ~ 20까지 임의로 만들어 배열에 넣어보기
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(19) + 2; //0 ~ 18 + 2 -> 2 ~ 20
//			System.out.println(score[i]);
		}
		for (int x : score) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		
		//3이상인 숫자 몇 개인지 출력
		int count = 0;
		for(int i = 0; i < score.length; i++) {
			if(score[i] >= 3) {
				count++;
			}
		}
		System.out.println(count + "개");
	}

}
