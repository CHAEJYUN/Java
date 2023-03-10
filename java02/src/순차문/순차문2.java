package 순차문;

import javax.swing.JOptionPane; //부품이 있는 위치를 알려줌

public class 순차문2 {

	public static void main(String[] args) {
		//기본 순차문 => 입력 - 처리 - 출력
		//입력 => 부품 사용(망치같은 언제나 바로 사용할 수 있는 것)
		//다이얼로그 같은 곳에서 입력한 값은 컴퓨터는 무조건 String으로 인식
		String data1 = JOptionPane.showInputDialog("정수를 입력하세요");
		String data2 = JOptionPane.showInputDialog("정수를 입력하세요");
		
		//처리 => 숫자 연산
		//String을 int로 변경해주어야함
		//자주 쓰는 거는 대문자로 시작
		int data3 = Integer.parseInt(data1);
		int data4 = Integer.parseInt(data2); //
		
		double data5 = Double.parseDouble(data1);
		double data6 = Double.parseDouble(data2);
		
		int result = data3 + data4; //결과는 String
		double result2 = data5 + data6; //결과는 String

		//출력 => 화면에 띄움
		System.out.println(result);
		System.out.println(result2);
	}

}
