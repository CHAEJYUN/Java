package 제어문;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 0 ~ 9 사이의 랜덤한 수 출력
//		Random random = new Random(); // 랜덤 안에 숫자 넣으면 고정됨 => seed값
//		for (int i = 0; i < 6; i++) {
//			System.out.println("random.nextInt(10));
//		}

		//로또 번호 생성기
//		Random random = new Random();
//		for (int i = 0; i < 6; i++) {
//			System.out.println("로또 번호 : " + random.nextInt(45) + 1);
//			
//		}
		
		// 2 ~ 10
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println(random.nextInt(9) + 2); // 0 ~ 8 = +2 => 2 ~ 10
		}
			
			//3 ~ 30
			System.out.println(); // 빈줄
			for (int j = 0; j < 6; j++) {
				System.out.println(random.nextInt(28) + 3); //0 ~ 27 = +3 => 3 ~ 30
		}
	}

}
