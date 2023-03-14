package 조건문;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

public class 설문조사2 {

	public static void main(String[] args) {
		//10명에게 인기투표 결과를 받아보자
		//1)IU 2)NEWJEANS 3)BTS

		//변수 선언
		int IU = 0;
		int NEWJEANS = 0;
		int BTS = 0;

		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("누구를 좋아하시나요? IU는 '1' NEWJEANS는 '2' BTS는 '3'");

			if (data.equals("1")) {
//				full = full + 1; //0 + 1
				IU++; //위에랑 같은 코드
			} else if (data.equals("2")) {
				NEWJEANS++;
			} else if (data.equals("3")) {
				BTS++;
			}
		}
		System.out.println("아이유를 좋아하는 사람 " + IU + "명");
		System.out.println("뉴진스를 좋아하는 사람 " + NEWJEANS + "명");
		System.out.println("방탄소년단을 좋아하는 사람 " + BTS + "명");
	}

}
