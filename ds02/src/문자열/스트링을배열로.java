package 문자열;

public class 스트링을배열로 {

	public static void main(String[] args) {
		
		String s = "감자, 고구마, 양파";
		String[] s2 = s.split(", ");
		System.out.println(s2.length);
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2[0].equals(s2[1]));
		
		String s3 = " 홍길동";
		String s4 = s3.trim(); //공백 없애는 방법 - 1
		System.out.println(s4);
		String s5 = s3.replace(" ", ""); //공백 없애는 방법 - 2
		System.out.println(s5);
		String s6 = "김길동";
		char[] s7 = s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
	}

}
