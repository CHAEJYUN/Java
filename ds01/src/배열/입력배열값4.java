package 배열;

import java.util.Scanner;

public class 입력배열값4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 22.2) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
