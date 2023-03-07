package 제어문;

import javax.swing.JOptionPane;

public class FifthStep {

	public static void main(String[] args) {
		//프로그램 순서 짜는 법
		//1. 입력: 데이터를 가지고 옴
		//2. 처리: 특정한 작업 수행
		//3. 출력: 처리한 내용을 보여줌
		//외부에서 대화창 같은 것으로 입력받은 경우는 무조건 문자열로 인식
		
		//입력
		String name  = JOptionPane.showInputDialog("당신의 이름은 무엇입니까?");
		
		//처리
		String result = "저의 이름은 " + name + "입니다.";
		
		//출력
		System.out.println(result);

	}

}
