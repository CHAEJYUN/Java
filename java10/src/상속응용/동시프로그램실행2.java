package 상속응용;

public class 동시프로그램실행2 {
	
	public static void main(String[] args) {
		//2. 스레드 사용
		스레드2_1 스스레드2_1 = new 스레드2_1();
		스레드2_2 스스레드2_2 = new 스레드2_2();
		스레드2_3 스스레드2_3 = new 스레드2_3();		
		
		//3. 스레드 동시에 돌아가는 프로그램 시작
		스스레드2_1.start();
		스스레드2_2.start();
		스스레드2_3.start();
	}

}
