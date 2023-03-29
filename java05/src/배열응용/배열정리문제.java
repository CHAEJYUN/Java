package 배열응용;

import java.io.PushbackInputStream;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class 배열정리문제 {

	public static void main(String[] args) {
//		// 문제1.
//		// 정수 5개 크기의 배열을 만듦
//		int[] arr = new int[5];
//		// scanner을 사용해 10, 20, 30, 40, 50을 순서대로 넣음
//		Scanner scanner = new Scanner(System.in);
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("정수를 입력하세요");
//			arr[i] = scanner.nextInt();
//		}
//		// 첫 번째 값과 세 번째 값을 더해 출력
//		System.out.println("첫 번째 값과 세 번째 값을 더한 값 : " + (arr[0] + arr[2]));
		
		// 문제2.
		
		// String 3개 크기의 배열을 만듦
		String[] arr2 = new String[3];
		
		// scanner 사용해 자바, 스프링, JSP를 순서대로 넣음
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("문자열을 입력하세요");
			arr2[i] = scanner.next();
		}
		
		// "자바 보다는 스프링"으로 출력
		System.out.println(arr2[0] + " 보다는 " + arr2[1]);

	}

}
