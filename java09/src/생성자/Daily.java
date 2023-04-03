package 생성자;

public class Daily {

	public static void main(String[] args) {
		
		Day day1 = new Day("자바공부", 8, "삼성역");
		System.out.println(Day.count);
		//객ㅊㅔ 생성할 때마다 count, sum
		System.out.println(Day.sum);
		//static이 붙은 메서드나 변수는 객체 생성하지 않아도
		//클래스 이름으로 바로 접근해서 사용 가능
		Day day2 = new Day("주변산책", 1, "코엑스");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3 = new Day("시험정리", 3, "강의실");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		//총 12개 다이나믹 생성, 멤버변수 => 객체 생성할 때마다 다이나믹하게 무더기영역(heap)에
		//생긴 변수를 인스턴스 변수라고 부른다
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	}

}
