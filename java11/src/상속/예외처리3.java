package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		
		int[] num = new int[3];
		
		try {
			num[3] = 2; //실행 안 됨
		} catch (Exception e) {
			System.out.println("문제 발생ㅇㅇㅇ");
		}

		System.out.println(num.length);
	}

}
