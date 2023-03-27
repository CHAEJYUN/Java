package 배열;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		int[] num = new int[5];
		//전체만들어지는 변수의 개수는 7개
		System.out.println(num.length);
		//배열의 크기, 배열의 길이, 배열의 사이즈
		num[0] = 100;
		System.out.println(num[0]);
		num[4] = 500;
		System.out.println(num[4]);
		num[2] = 200;
		System.out.println(num[2]);
		//index 0~4
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		
	}

}
