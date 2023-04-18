package 문자열;

public class 스트링특징 {

	public static void main(String[] args) {
		//String은 데이터가 변경되는 경우
		//새로운 곳에 String을 저장할 변수를 생성
		//메모리 관리부분에서 비효율적
		String s = "정길동";
		String s2 = "정길동";
		//String은 출력할 때, 그 주소가 가르키는 char을 프린트 되게
		//재정의 되어있는 객체(toString(), 오버라이드)
		System.out.println(s);
		System.out.println(s2);
		
		//String이 가르키는 char이 동일한지 => equals()
		System.out.println(s.equals(s2));
		//String이 들어있는 주소가 동일한지 =>   ==
		System.out.println(s == s2);
		
		//같은 값이면 전에 만든 값 가리킴, 새로 안 만들고
		s = "김길동";
		System.out.println(s.equals(s2));
		System.out.println(s == s2);
		
		//String을 사용하는 것은 좋으나
		//String 값이 자주 변경되는 것은 비효율
		StringBuilder builder = new StringBuilder();
		builder.append("송길동");
		System.out.println(builder);
	}

}
