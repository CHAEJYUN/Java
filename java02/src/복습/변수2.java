package 복습;

public class 변수2 {

	public static void main(String[] args) {
		//정수형 변수 4가지
		//1. byte ==> -128~127, 1바이트
		//2. short ==> -3만~3만, 2바이트
		//3. int ==> -21억~21억, 4바이트
		//4. long ==> 21억 이상, 8바이트
		byte a = 127;
//		byte b = 128; //오류남
		short c = 100;
		int d = 1000;
		long e = 100000000L; //l 혹은 L 써야함 
		
		//실수형 변수 2가지
		//1. float ==> 소수점 4자리까지, 4바이트
		//2. double ==> 소수점 4자리이상, 8바이트
		float f = 1.1F; //f 혹은 F 써야함
		double g = 2.222222;
	}

}
