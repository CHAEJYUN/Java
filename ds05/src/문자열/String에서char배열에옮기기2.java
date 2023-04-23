package 문자열;

import java.util.Arrays;

public class String에서char배열에옮기기2 {

	public static void main(String[] args) {
		
		String s = "s205621"; //String도 index를 이용해서 추출가능 		
		char c = s.charAt(3);
		char c2 = s.charAt(4);
		String s2 = String.valueOf(c) + String.valueOf(c2);
		System.out.println(s2);
		System.out.println(s.substring(3, 5));
		
		char[] result = new char[2];
		s.getChars(3,  5, result, 0);
		System.out.println(Arrays.toString(result));
		
		//모든 글자를 String[]으로 옮기기
		String[] all = s.split("");
		System.out.println(all[0] + all[all.length - 1]);
	}

}
