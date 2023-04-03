package 생성자;

public class 통장사용하기 {

	public static void main(String[] args) {

		통장 여행통장 = new 통장("홍길동", "990909", 100000);
		통장 청약통장 = new 통장("홍길동", "990909", 200000);
//		System.out.println(여행통장.name);
//		System.out.println(여행통장.ssn);
//		System.out.println(여행통장.money);
		
		System.out.println(여행통장); //toString()이 써있는 경우
		//주소가 아니고, 그 주소가 가르키는 멤버변수 값들을 
		System.out.println(청약통장);
	}
	
}
