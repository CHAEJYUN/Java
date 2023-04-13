package 배열;

import java.util.Scanner;

public class 입력배열값2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//자바와 키보드를 강물로 이어줌
		
		double[] number = new double[5];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextDouble();
		}
		sc.close();
		
		for (double d : number) {
			System.out.println(d);
		}
		for (int i = 0; i < number.length; i++) {
			if(number[i] == 22.2) {
				System.out.println("위치는 " + i);
			}
			if(number[i] == 33.3) {
				System.out.println("위치는 " + i);
			}
		}
	}

}
