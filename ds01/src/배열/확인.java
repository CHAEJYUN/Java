package 배열;

import java.util.Arrays;

public class 확인 {

	public static void main(String[] args) {
		// 1. 값을 바로 넣을 때
		int[] age = {10, 20, 30, 40, 50};
		
		// 2. 값을 나중에 넣을 때
		double[] weight = new double[5];
		weight[0] = 33.3;
		weight[1] = 44.4;
		weight[2] = 55.5;
		weight[3] = 66.6;
		weight[4] = 77.7;
		
		// for
		// 1. C타입 
		for (int i = 0; i < weight.length; i++) {
			System.out.println(age[i] + " " + weight[i]);
		}
		// 2. for-each
		for (int i : age) {
			System.out.println(i);
		}
		for (double d : weight) {
			System.out.println(d);
		}
		// 출력용 3.
		System.out.println(Arrays.toString(weight));
	}

}
