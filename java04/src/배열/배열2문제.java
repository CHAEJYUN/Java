package 배열;

import java.awt.geom.FlatteningPathIterator;

public class 배열2문제 {

	public static void main(String[] args) {
		// (1) 가족 성별
		char[] f1 = {'남', '여', '여', '여'};
		for (int i = 0; i < f1.length; i++) {
			System.out.print(f1[i] + " ");
		}
		
		// (2) 가족 이름
		String[] f2 = {"김OO", "이OO", "김OO", "김OO"};
		for (int i = 0; i < f2.length; i++) {
			System.out.print(f2[i] + " ");
		}
		
		// (3) 가족 시력
		double[] f3 = {1.5, 0.3, 1.0, 0.06};
		for (int i = 0; i < f3.length; i++) {
			System.out.print(f3[i] + " ");
		}
		
		// (4) 가족 점심 유무
		boolean[] f4 = {true, false, true, false};
		for (int i = 0; i < f4.length; i++) {
			System.out.print(f4[i] + " ");
		}
	}

}
