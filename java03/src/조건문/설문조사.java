package 조건문;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

public class 설문조사 {

	public static void main(String[] args) {
		//10명에게 배부른가요? 물어봐서
		//배부르다고 한 사람과 안 배부르다고 한 사람 카운트
		
		//변수 선언
		int full = 0;
		int unfull = 0;
		
		for (int i = 0; i <10; i++) {
			String data  = JOptionPane.showInputDialog("배가 부른가요? 부르면 '1' 안 부르면 '2'");
			//입력받는 건 String이니까 equals 써야함
			if (data.equals("1")) {
//				full = full + 1; //0 + 1
				full++; //위에랑 같은 코드
			} else if (data.equals("2")) {
				unfull++;
			} //else
		} //for
		System.out.println("배부른 사람? " + full + "명");
		System.out.println("안 배부른 사람? " + unfull + "명");
	}

}
