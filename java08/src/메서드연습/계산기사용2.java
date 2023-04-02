package 메서드연습;

public class 계산기사용2 {

	public static void main(String[] args) {
		
		계산기2 cal2 = new 계산기2();
		int result2 = cal2.add(300, 200);
		double result3 = cal2.add(300, 222.2);
		double result4 = cal2.add(111.1, 222.2);
		String result5 = cal2.add(1, "등");
		
		System.out.println(result2 + 1);
		System.out.println(result3 - 1);
		System.out.println(result4 + 1);
		System.out.println(result5 + "은 나");
	}

}
