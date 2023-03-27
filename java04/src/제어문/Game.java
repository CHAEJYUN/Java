package 제어문;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Random r = new Random();
		int target = r.nextInt(100); // 0 ~ 99
		Scanner sc = new Scanner(System.in);

		int data = 0;
		int count = 0;
		while (true) {
			System.out.print("생각한 정답은? ");
			data = sc.nextInt();
			count++;
			if (data == target) {
				System.out.println("정답입니다");
				System.out.println("당신의 시도 횟수는 " + count);
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("오답입니다, 다시 시도해주세요");
				if (data > target) {
					System.out.println(">>>>>너무 커요");
				} else {
					System.out.println("<<<<<너무 작아요");
				}

			}
		}
		sc.close();
	}

}
