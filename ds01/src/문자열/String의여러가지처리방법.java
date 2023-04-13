package 문자열;

public class String의여러가지처리방법 {

	public static void main(String[] args) {
		
		String s = "나는 프로그래머야";
		String s2 = "진짜";
		
		System.out.println(s + s2); //결합
		System.out.println(s.concat(s2)); //결합2
		System.out.println(s.charAt(0)); //인덱스 0번 문자 추출
		System.out.println(s.endsWith("야")); //특정한 문자로 끝나는지 확인
		System.out.println(s.substring(3)); //인덱스 3번 이후 문자열 모두 추출 
		System.out.println(s.substring(3,8)); //인덱스 3 ~ 7 문자열 추출
		System.out.println(s.contains(s2)); //s에 s2가 포함되는지 확인
		System.out.println(s.lastIndexOf("프")); //s중 '프' 문자 위치
		System.out.println(s.toUpperCase()); //대문자로
		System.out.println(s.toLowerCase()); //소문자로
		System.out.println(s.length()); //글자 수
		System.out.println(s.replace("나", "너")); //문자 대체
	}

}
