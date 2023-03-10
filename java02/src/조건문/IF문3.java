package 조건문;

public class IF문3 {

	public static void main(String[] args) {
		//조건이 여러 개일 때
		int myNum = 99;
		
		//if문은 조건이 맞아서 실행하고 나서 자동으로 끝남
		if (myNum >= 80) {
			System.out.println("최우수");
		} else if (myNum >= 70) {
			System.out.println("우수");
		} else if (myNum >= 60) {
			System.out.println("보통");
		} else {
			System.out.println("미달");
		}
		
		int myTour = 10; //여행 횟수
		
		//switch문
		//break 써줘야 함
		switch(myTour) {
		case 10:
			System.out.println("VVIP");
			break;
		case 6:
			System.out.println("VIP");
			break;
		default:
			System.out.println("Normal");
		}
	}

}
