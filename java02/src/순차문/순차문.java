package 순차문;

//부품이 있는 위치를 알려줌
import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		//기본 순차문 == 입력 -> 처리 -> 출력
		//입력 ==> 부품 사용(망치같은 언제나 바로 사용할 수 있는 것)
		String data1 = JOptionPane.showInputDialog("당신의 취미는? ");
		String data2 = JOptionPane.showInputDialog("언제 하시나요? ");
		
		//처리 ==> 글자 연결('+' 연산자 사용)
		//더해진 데이터가 하나라도 String이면 결과도 무조건 String
		String result = data1 + " " + data2;
		//숫자로 계산하고 싶은 거만 먼저 괄호로
//		String result2 = data1 + (100 + 200);
		
		//출력 ==> 화면에 띄움
		System.out.println(result);
	}

}
