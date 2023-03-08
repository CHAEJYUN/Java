package 변수;

public class 변수 {

	public static void main(String[] args) {
		//기본형 4가지
		//정수형, 실수형, 문자1, 논리
		
		int num1 = 1; //정수형 선언 및 초기화
		              //정수형 기본타입은 int
		long num2 = 111111L; //정수형 선언 및 초기화
		                     //Long타입 명시 안 하면 int로 인식
		                     //21억을 넘으면 에러가 뜸
		
		float num3 = 11.121f; //실수형 선언 및 초기화, 정수도 가능
		                      //float타입 명시 해주어야 함
		double num4 = 11.11111; //실수형 선언 및 초기화, 정수도 가능
		                        //실수형 기본타입은 double
		
		char a = '빵'; //문자 1글자
		boolean b = true; //논리형(true, false)
		
		//참조형
		String name = "홍길동"; //문자열
		
		//char은 ' ', String은 " " 사용
		
		num1 = 100; //변수 값 변경 가능
		
		System.out.println("정수 값은 " + num1);
		System.out.println("실수 값은 " + num4);
		System.out.println("문자는 " + a);
		System.out.println("논리 값은 " + b);
		System.out.println("내이름은 " + name + "입니다.");
	}

}
