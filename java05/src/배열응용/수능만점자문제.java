package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
	
		int[] score = new int[1000]; //1000명의 점수를 담을 배열
		Random r = new Random();
		for(int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(451); //0 ~ 450의 랜덤 값이 score 배열 안에 들어감
			System.out.println(score[i]);
		}

//		1) 만점자가 몇 명인지? 누구인지(인덱스)
//		2) 0점이 몇 명인지?
		int max = 0;
		int min = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 450) {
				max++;
			}else if (score[i] == 0) {
				min++;
			}
		}
		System.out.println("수능 만점자 : " + max + "명");
		System.out.println("수능 0점자 : " + min + "명");

//		3) 평균은 어떻게 되었는지?
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		avg = sum / score.length;
		System.out.println("평균 : " + avg + "점");
		
//		4) 평균보다 +-50점 인 학생 카운트(포함, >=)
		int plus = 0;
		int minus = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= avg + 50) {
				plus++;
			} else if (score[i] <= avg - 50) {
				minus++;
			}
		}
		System.out.println("평균+50인 학생 : " + plus + "명");
		System.out.println("평균-50인 학생 : " + minus + "명");
	}
	
}
		