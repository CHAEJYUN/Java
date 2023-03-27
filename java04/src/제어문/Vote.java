package 제어문;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {

		int iu = 0, bts = 0, newjeans = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("인기투표 시스템\n===============");
		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >> ");
			int choice = sc.nextInt(); // "2" --> 2
			if (choice == 4) {
				System.out.println("시스템 종료");
				break; //
			} else if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				bts++;
			} else if (choice == 3) {
				newjeans++;
			} else {
				System.out.println("해당 번호가 없음");
			}
		}
		sc.close();

		System.out.println("\n===> 1)아이유: " + iu + "표, 2)방탄: " + bts + "표, 3)뉴진스: " + newjeans + "표");
	}

}
