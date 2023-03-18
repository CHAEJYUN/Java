package 반복문;

public class For1 {

	public static void main(String[] args) {
		//3번 반복
		for (int i = 0; i < 3; i++) {
			System.out.println("내가 반복1");
		}
		
		//100번 반복
		for (int i = 0; i < 100; i++) {
			System.out.println("나도 반복2 " + i);
		}
		
		//10번 반복, n번째 실행중
		for (int i = 0; i < 10; i++) {
			System.out.println("나는 반복3 " + (i + 1) + "번째 실행중");
		}
	}

}
