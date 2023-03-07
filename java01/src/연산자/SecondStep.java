package 연산자;

public class SecondStep {

	public static void main(String[] args) {
		//논리연산자
		int id1 = 1111;
		int id2 = 2222;
		
		int pw1 = 3333;
		int pw2 = 3333;
		
		//두 조건이 동일한지 비교(==)
		System.out.println(id1 == id2);
		System.out.println(pw1 == pw2);
		
		//두 조건이 모두 맞으면 맞다(&&), and와 같음
		System.out.println(id1 == id2 && pw1 == pw2);
		
		//두 조건 중 하나라도 맞으면 맞다(||), or과 같음
		System.out.println(id1 == 1111 || id2 == 3333);
		

	}

}
