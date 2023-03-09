package 복습;

public class 연산 {

	public static void main(String[] args) {
		//자바 연산시 주의점
		int x = 10;
		int y = 20;
		System.out.println(x / y); //소수점까지는 안 나타남
		//정수끼리의 계산의 결과는 무조건 정수
		
		int a = 10;
		double b = 20;
		System.out.println(a / b);
		//계산시 하나라도 실수면 결과는 무조건 실수
		
		//이미 정수로 저장된 값을 실수로 연산하고 싶다면?
		System.out.println(x / (double)y); //강제형변환
	}

}
