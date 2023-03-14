package 조건문;

import java.util.Date;

public class 날짜및요일 {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		int year = date.getYear() + 1900; //2023년
		int day = date.getDay();
		int month = date.getMonth() + 1;
		
		//0 : 일요일, 1 : 월요일, 2 : 화요일
		//3 : 수요일, 4 : 목요일, 5 : 금요일, 6 : 토요일
		switch (day) {
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("평일");
			break;
		case 0:
			System.out.println("주말");
			break;
		case 6:
			System.out.println("주말");
			break;
		}
		
		//월
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
		default: //나머지 달
			System.out.println("31일까지");
			break;
		}
	}

}
