package 조건문;

public class IF문 {

	public static void main(String[] args) {
		
		int x = 0;
		
		//조건을 쓸 때는 비교하는 것으로 쓰고, 결과는 무조건 true or false
		//비교연산자는 기본형 데이터만 가능
		if (x == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if (x == 1) {
			System.out.println("실행될까요?");
		}
	}

}
