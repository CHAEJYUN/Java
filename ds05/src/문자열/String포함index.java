package 문자열;

public class String포함index {

	public static void main(String[] args) {

		String s = "aaabbccdda";
		
		//문자(열)포함 되어 있니? => boolean
		System.out.println(s.contains("a"));
		System.out.println(s.contains("aaa"));
		System.out.println(s.contains("z"));

		//a의 첫 번째 위치
		System.out.println(s.indexOf("a"));
		//a의 마지막 위치 - 전체에서
		System.out.println(s.lastIndexOf("a"));
		//a의 마지막 위치 - 조건 안에서
		System.out.println(s.lastIndexOf("a", 3)); // 0 ~ 2
		System.out.println(s.lastIndexOf("a", 8)); // 0 ~ 7
		//없는 거를 찾으면? => -1
		System.out.println(s.indexOf("z"));
	}

}
