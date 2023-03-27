package 배열;

import java.util.Arrays;

public class 배열1 {

	public static void main(String[] args) {
		// 배열 =  여러 개의 데이터를 램에 저장해두고 cpu가 접근해 사용하고 싶은 경우
				// 1. 값을 이미 아는 경우
				int[] score = {10, 20, 30, 40}; //length 만들어서 몇개인지 세서 값 넣어줌
				System.out.println(score); //배열 주소
				System.out.println(score[0]); //첫 번째 값
				System.out.println(score[1]); //두 번째 값
				System.out.println(score[2]); //세 번째 값
				System.out.println(score[3]); //네 번째 값
				System.out.println("전체 개수 : " + score.length); //배열 길이
				
				score[0] = 100; //10 <- 100
				System.out.println(score[0]);
				
				// 배열 전체 값 출력하기
				System.out.println(Arrays.toString(score));
				
				for(int i=0; i < score.length; i++) {
					System.out.print(score[i] + " ");
					System.out.println(); //한 줄 띄우기
				}
				
				// 2. 값을 모르는 경우(저장공간만 미리 만들어두기)
				int[] score2 = new int[4];
				score2[0] = 100;
				System.out.println(score2[0]);
	}

}
