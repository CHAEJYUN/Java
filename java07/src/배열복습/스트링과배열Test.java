package 배열복습;

public class 스트링과배열Test {

	public static void main(String[] args) {
		
		String s1 = "   010-1234-5678   ";
		String s11 = s1.trim(); //공백제거
		System.out.println(s11);
		String[] s111 = s1.split("-"); //'-' 기준으로 나누기
		System.out.println(s111[0]);
		System.out.println(s111[1]);
		System.out.println(s111[2]);
	}

}
