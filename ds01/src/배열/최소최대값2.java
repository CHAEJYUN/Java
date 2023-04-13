package 배열;

import java.util.Arrays;
import java.util.Random;

public class 최소최대값2 {

	public static void main(String[] args) {
		
		Random r = new Random(100);
		int[] s = new int[10]; 
		int[] s2 = new int[10]; 
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000);
			s2[i] = r.nextInt(1000);
		}
		
		//오름차순으로 정렬한 후 맨 앞 최소값, 맨 끝 최대값
		Arrays.sort(s); //원본을 바꿔버림(파괴형)
		
		System.out.println("최소값은 " + s[0]);
		System.out.println("최대값은 " + s[9]);
		
		if(Arrays.equals(s, s2)) {
			System.out.println("두 개의 배열이 같다");
		}else {
			System.out.println("두 개의 배열이 다르다");
		}
		
		String result = Arrays.toString(s);
		System.out.println(result);
		
		System.out.println("String 글자수 " + result.length());
		System.out.println("배열 길이 " + s.length);
	}

}
