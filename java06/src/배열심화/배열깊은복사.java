package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		
		int[] num1 = {100, 200, 300};
		//int[] num1 = num2; //얕은 복사, 주소가 복사
		
		int[] num2 = num1.clone(); //깊은 복사, 주소가 가리키고 있는 값들 복사
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);
		
		num1[0] = 999;
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num1[i] + " ");
		}
		System.out.println("========================");
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i] + " ");
		}
	}

}
