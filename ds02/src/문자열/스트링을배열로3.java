package 문자열;

import java.util.Scanner;

public class 스트링을배열로3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주말 날씨를 순서대로 입력해보세요");
		
		String data = sc.next();
		
		System.out.println(data);
		
		String[] data2 = data.split(",");
		
		for(int i = 0; i < data2.length; i++) {
			System.out.println(data2[i]);
		}
	}

}
