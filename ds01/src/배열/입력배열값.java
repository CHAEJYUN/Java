package 배열;

import java.util.Scanner;

public class 입력배열값 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//자바와 키보드를 강물로 이어줌
		
		int[] number = new int[3];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt(); //입력받아서 int로 바꿔라, 배열에 넣어라			
		}
		sc.close(); //stream close
		
		for (int i : number) {
			System.out.println(i);
		}
		for (int i = 0; i < number.length; i++) {
			if(number[i] == 22) {
				System.out.println("위치는" + i);
			}
		}
	}

}
