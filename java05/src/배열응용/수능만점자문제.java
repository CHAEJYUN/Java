package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		//1000명의 점수를 처리
		int[] score = new int[1000];
		
		Random r = new Random(42);
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(451); //0 ~ 450
		}

		for (int i = 0; i < score.length; i++) {
			System.out.println(i + " : " + score[i]);
		}
		
		System.out.println();
		
//		0 ~ 450 
//		1) 만점자가 몇 명인지? 누구인지(인덱스)
//		2) 0점이 몇 명인지?
		int maxCount = 0;
		int zeroCount = 0;
		for (int x : score) {
			//점수가 450과 동일한지 체크해서 true이면 카운트 증가
			if (x == 450) {
				maxCount++; //maxCount = maxCount + 1;
			} //if
			if (x == 0) {
				zeroCount++;
			} //if
		}//for
		System.out.println("수능 만점자: " + maxCount + "명");
		System.out.println("수능 0점자: " + zeroCount + "명");

//		3) 평균은 어떻게 되었는지?
		int sum = 0;
		for (int x : score) {
			sum = sum + x; //sum += x;
		}
		double avg = (double)sum / score.length;
		System.out.println("전체 수험생의 평균은 " + avg);
		
//		4) 심화)) 평균보다 +-50점 인 학생 카운트(포함, >=)

		int avgPlusMinus = 0;
		//250 ~ 350, avg = 300인 경우
		//avg-50 <= x <= avg+50 --> avg-50 <= x && x <= avg+50
		for (int x : score) {
			if ((avg-50 <= x) && (x <= avg+50)) {
				avgPlusMinus++;
			}
		}//for
		System.out.println("평균 범위에 있는 수험생수는 " + avgPlusMinus + "명");
		
		//점수의 상위 30%
		//100의 30%이면 30점
		//상위 30%인원수 : 3000명, 각 점수, 평균
		Arrays.sort(score);
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + ": " + score[i]);
		}
		//9999-3000 = 7000
		int count = 0;
		int sum2 = 0;
		for (int i = 7000; i < 10000; i++) {
			System.out.println(i + ": " + score[i]);
			count++;
			sum2 = sum2 + score[i];
		}
		System.out.println("30% 평균은 " + (double)sum2 /3000);
		System.out.println(count);
	}

}
