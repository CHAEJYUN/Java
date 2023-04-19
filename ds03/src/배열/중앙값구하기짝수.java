package 배열;

import java.util.Arrays;

public class 중앙값구하기짝수 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17, 21 };
		//배열에 들어간 하나의 값 => element
		String s2 = Arrays.toString(s); //배열 값 출력
		System.out.println(s2);
		//짝수면
		//중앙에 있는 2개의 값을 더해서
		//1. 정렬
		Arrays.sort(s); //파괴
		System.out.println(Arrays.toString(s));
		//2. 중앙위치
		int center = s.length / 2;
		int center2 = s.length / 2 - 1;
		//3. 배열의 중앙위치값을 get
		System.out.println(center);
		System.out.println(center2);
		int answer = s[center] + s[center2];
		System.out.println(answer);
	}

}
