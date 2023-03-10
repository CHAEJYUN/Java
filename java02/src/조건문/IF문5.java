package 조건문;

public class IF문5 {

	public static void main(String[] args) {

		String data = "1234567";

		// String은 기본형 데이터가 아니여서 명령어(함수)를 사용해야함
		if (data.equals("1234567")) { // 주민등록번호 뒷자리
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}

		char gender = data.charAt(0); // 첫번째 자리에 있는 문자 하나 추출
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
	}
	
}
