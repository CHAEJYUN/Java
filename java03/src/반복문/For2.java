package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		//무한 루프
		for ( ; ;) { 
			System.out.println("잘 안 씀");
			String data = JOptionPane.showInputDialog("종료할까요? y입력시 종료");
			
			//== 연산자는 기본데이터만 비교가능
			//String부품에서 제공하는 기능을 사용해서 비교해야함
			if (data.equals("y")) {
				System.out.println("안녕히가세요");
				break; //for문's break
			} 
		}
	}

}
