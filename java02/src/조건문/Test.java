package 조건문;

import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		//1 ~ 2. equals() 사용
		//1. 암호 입력 창 띄어서 'pass' 입력
		//   맞으면 '승인', 틀리면 '거절'
//		String pw = JOptionPane.showInputDialog("암호를 입력하시오");
//		
//		if (pw.equals("pass")) {        //true
//			System.out.println("승인");
//		} else {                        //false
//			System.out.println("거절");
//		}
		
		//2. 메뉴 입력 창 띄어서 (불고기, 초밥, 짜장면) 중에서 선택
		//   불고기면 '한식', 초밥이면 '일식', 짜장면이면 '중식'
//		String menu = JOptionPane.showInputDialog("불고기, 초밥, 짜장면 중 어떤 것을 드시겠습니까?");
//		
//		if (menu.equals("불고기")) {
//			System.out.println("한식");
//		} else if (menu.equals("초밥")) {
//			System.out.println("일식");
//		} else if (menu.equals("짜장면")) {
//			System.out.println("중식");
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		//3. JOptionPane을 사용해 두 정수를 입력받아 비교
//		String n1 = JOptionPane.showInputDialog("정수를 입력하세요");
//		String n2 = JOptionPane.showInputDialog("정수를 입력하세요");
		
		//Integer.parseInt()
		//정수로 변환
//		int n3 = Integer.parseInt(n1);
//		int n4 = Integer.parseInt(n2);
//		
//		if (n3 > n4) {
//			System.out.println("첫 번째 정수가 더 크다.");
//		} else if (n3 < n4) {
//			System.out.println("두 번째 정수가 더 크다.");
//		} else { //n3 == n4
//			System.out.println("두 정수가 같다.");
//		}
		
		//4. 사원번호 'A100EX'
		//   맨 앞 글자 추출
		//   A면 기획부, B면 총무부, C면 개발부 아니면 해당부서 없음
		String no = "A100EX";
		System.out.println(no.charAt(0)); //바로 추출해도되고
		
		char ch = no.charAt(0);//변수 값 안에 넣어서 활용해도됨
		
		switch (ch) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
		case 'C':
			System.out.println("개발부");
		default:
			System.out.println("해당부서 없음");
			break;
		}
	}

}
