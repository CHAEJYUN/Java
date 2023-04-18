package 문자열;

public class 스트링을배열로test {

	public static void main(String[] args) {
		
		String s = " 011-245-1234 ";
		System.out.println(s);
		s = s.trim();
		System.out.println(s);

		String[] s2 = s.split("-");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		
		if(s2[0] == "011") {
			System.out.println("SK");
		}else if(s2[0] == "019") {
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		
		if(s2[1].length() >= 4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		
		if(s2.length >= 10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
