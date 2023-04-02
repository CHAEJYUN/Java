package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		//스트링의 일부를 추출, 확인하는 메서드
		String s1 = "나는 개발자야 ";
		String s2 = "나도";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2)); //String
		System.out.println(s1.charAt(0));
		
		char c = s1.charAt(0); //한 문자만 추출
		System.out.println(s1.endsWith(" ")); //true or false
		boolean result1 = s1.endsWith(" ");
		System.out.println(result1);
		
		String result2 = s1.substring(3); //인덱스 3부터
		System.out.println(result2);
		String result3 = s1.substring(3, 6); //인덱스 3 ~ 8
		System.out.println(result3);
		boolean result4 = s1.contains(s2);
		System.out.println(result4);
		int index = s1.lastIndexOf("개");
		System.out.println(index);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length()); //글자 개수
		s1 = s1.replace("나", "너");//비파괴함수, CPU에서만 변경함
		System.out.println(s1);
	}

}
