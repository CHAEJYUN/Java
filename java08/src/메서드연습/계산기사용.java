package 메서드연습;

public class 계산기사용 {

	public static void main(String[] args) {
		
		계산기 cal = new 계산기();
		cal.더하기(2, 3);
		cal.곱하기(30, 20, 10); //void
		int result = cal.빼기(500, 200); //300
		//넘겨와서 작업을 더 하고 싶을 때 이렇게 씀
		System.out.println(result - 100);
	}

}
