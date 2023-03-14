package 반복문;

public class Continue {

	public static void main(String[] args) {
		//1 ~ 10중에 짝수만 출력
		for (int i = 0; i < 10; i++) {
			
			if (i == 8) {
				System.exit(0); //i가 8이 되면 for문 종료, 0 : 정상적으로 종료
			}

			if (i % 2 != 0) { //홀수이면
				continue; //이번 i 넘어가기
			}

			System.out.println(i);
		}
	}

}
