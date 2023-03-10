package 조건문;

import java.util.Date;

public class IF문4 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date.getYear() + 1900); //년도
		System.out.println(date.getDate()); //날짜
		System.out.println(date.getDay()); //요일, 0부터 시작 일요일
		System.out.println(date.getHours()); //시간
		System.out.println(date.getMinutes()); //분
		System.out.println(date.getSeconds()); //초
		
		int hour = date.getHours(); //시간
//		int hour = 15; //시간
		
		if (hour < 11) {
			System.out.println("Good Morning");
		} else if (hour <14) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good night");
		}

		int month = date.getMonth() + 1; //달, 음력기준이라서  + 1
//		int month = 2;
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
		}
	}

}
