package 문자열;

public class 함수만들기 {
		
	public static void 빨래하다() {
		System.out.println("3-1. 세제를 넣는다");
		System.out.println("3-2. 세탁기를 가동한다");
	}
	public static void 헹구다() {
		System.out.println("4-1 헹굼 시작");
		System.out.println("4-2 강하게 헹군다");
	}
	public static void 탈수하다() {
		System.out.println("5-1 탈수 시작");
		System.out.println("5-2 물기를 제거한다");
	}
	
	public static void main(String[] args) {
		// 메서드(방법을 정의, 함수 == 메서드)
		//1.
		System.out.println("1. 빨래를 모은다");
		
		//2.
		System.out.println("2. 세탁기에 넣고");
		
		//3.
		빨래하다();
		
		//4.
		헹구다();
		
		//5.
		탈수하다();
		
		//6.
		System.out.println("6. 빨래를 넌다");
	}

}
