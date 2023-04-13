package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1.
//		int[] arr = new int[5];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		Arrays.sort(arr); //정렬ssssssssssssssss
//		
//		System.out.println(arr[0]);
		
		// 2.
//		Random r = new Random();
//		int [] arr2 = new int[20];
//		
//		for(int i = 0; i < arr2.length; i++) {
//			arr2[i] = r.nextInt(900);
//		}
//		int max = arr2[0];
//		
//		for (int x : arr2) {
//			if(x > max) {
//				max = x;
//			}
//		}
//		System.out.println(max);
		
		// 3.
//		String s = "참좋다";
//		String s2 = "진짜좋다";
//		
//		System.out.println(s.equals(s2));
//		
//		int n = s.length();
//		int n2 = s2.length();
//		
//		if(n > n2) {
//			System.out.println("s가 더 큼");
//		} else {
//			System.out.println("s2가 더 큼");
//		}
		
		// 4.
//		String s3 = "나는 진짜 java programmer가 되었어";
//		String s33 = s3.substring(6,21);
//		String s333 = s33.toUpperCase();
//		
//		System.out.println(s333);
		
		// 5.
		String s4 = "2056521";
		char s44 = s4.charAt(0);
		
		if(s44 == 1) {
			System.out.println("남자임");
		}else {
			System.out.println("여자임");
		}
//		switch(s44) {
//		case 1:
//			System.out.println("남자임");
//		case 2:
//			System.out.println("여자임");
//		}
	}

}
