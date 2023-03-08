package 연산자;

public class 연산자 {

	public static void main(String[] args) {
		//대입연산자
		//비교연산자 '=='와는 다름
		int id1 = 1111;
		int id2 = 2222;
		
		int pw1 = 3333;
		int pw2 = 3333;
		
		//논리연산자(&&, ||, !)
		//두 조건이 모두 맞으면 맞다(&&), and와 같음
		System.out.println(id1 == id2 && pw1 == pw2);
		
		//두 조건 중 하나라도 맞으면 맞다(||), or과 같음
		System.out.println(id1 == 1111 || id2 == 3333);
	}

}
