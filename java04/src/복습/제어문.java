package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문 {

	public static void main(String[] args) {
		// 스캐너 사용
		Scanner sc = new Scanner(System.in);
		
		// 문제1. id와 pw 입력해서 id가 'root'이고, pw가 '1234'이면 로그인 성공 아니면 로그인 실패
		// String은 == 불가능이므로, equals()를 사용해 비교해야함
//		System.out.println("id입력>>");
//		String id = sc.next();
//		System.out.println("pw입력>>");
//		String pw = sc.next();
//		
//		if(id.equals("root") && pw.equals("1234")) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
		
		// 문제2. 사과 구매 갯수, 사과 한 개당 가격입력
//		System.out.println("사과 개수>>");
//		int apple = sc.nextInt();
//		System.out.println("사과 가격>>");
//		int price = sc.nextInt();
//		
//		int total_price = apple * price;
//		System.out.println(total_price + "원");

		// 문제3.
		// - 시작값, 종료값 입력
		// 시작값부터 종료값까지 모두 더해서 출력
//		System.out.println("시작값>>>");
//		int start = sc.nextInt();
//		System.out.println("종료값>>>");
//		int end = sc.nextInt();
//		
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 문제4.
		// 시작 값, 종료 값, 점프 값 입력
		// 시작 값부터 종료 값까지 점프 값만큼 증가하면서 더함
		// 더한 값이 100을 넘으면 프로그램 종료
		System.out.println("시작값>>");
		int start = sc.nextInt();
		System.out.println("종료값>>");
		int end = sc.nextInt();
		System.out.println("점프값>>");
		int jump = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i += jump) {
			sum += i;
			if (sum >= 100) {
				System.exit(0);
			}
		}
		System.out.println(sum);
		
		sc.close();
	}

}
