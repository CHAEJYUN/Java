package 배열복습;

public class 스트링과배열2 {

	public static void main(String[] args) {
		
		String s1 = "감자,고구마,양파";
		//문자열 분리 => split(구분자)
		//분리된 결과는 배열에 들어감
		String[] s2 = s1.split(",");
		System.out.println(s2.length);
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		String s11 = "감자 고구마 양파";
		String[] s22 = s11.split(" ");
		System.out.println(s22[0]);
		System.out.println(s22[1]);
		System.out.println(s22[2]);
		
		String s3 = "   홍길동";
		System.out.println(s3.trim()); //공백제거
		String s4 = s3.trim();
		System.out.println(s4.length());
		
		String s5 = s3.replace("   ", "");
		System.out.println(s5);
		
		String s6 = "홍길동";
		char[] s7 = s6.toCharArray(); //각각의 글자를 하나하나 분리할 때
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
	}

}
