package 복습;

//JOptionPane이 javx 아래  swing 아래에 있음
import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		//입력 - 처리 - 출력
		//직접 입력하는 값은 모두 String으로 취급함
		String n1 = JOptionPane.showInputDialog("첫 번째 숫자를 입력하세요");
		String n2 = JOptionPane.showInputDialog("두 번째 숫자를 입력하세요");
		
		//String -> int
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		String n3 = "3.33";
		String n4 = "4.44";
		
		//String -> float
		float n33 = Float.parseFloat(n3);
		float n44 = Float.parseFloat(n4);
		System.out.println(n33);
		System.out.println(n44);
		
		//정수끼리의 계산의 결과는 정수라서 소수점이 안 나옴
		System.out.println(n11 / n22);
		//실수로 나타내고 싶으면
		System.out.println((double)n11 / n22);
		//소수점 자리수 지정하고 싶으면
		System.out.printf("%.3f", (double)n11 / n22);
	}

}
