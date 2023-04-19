package 배열;

import java.util.Arrays;

public class 중앙값구하기홀수 {

	public static void main(String[] args) {
		int[]s = {1, 77, 45, 13, 345};
		//배열에 들어간 하나의 값 => element
		String s2 = Arrays.toString(s); //배열 값 출력
		System.out.println(s2);
		//홀수면
		//1. 정렬
		Arrays.sort(s); //파괴
		System.out.println(Arrays.toString(s));
		//2. 중앙위치
		int center = s.length / 2;
		//3. 배열의 중앙위치값을 get
		System.out.println(center);
		int answer = s[center];
		System.out.println(answer);
	}

}
