package 배열;

public class Test {

	public static void main(String[] args) {

		int[] arr = new int[5]; //전체 만들어지는 변수의 개수는 7개(1개는 주소자리, 1개는 length자리)
		System.out.println(arr.length); //길이 출력
		arr[0] = 100;
		System.out.println(arr[0]); //첫 번째 출력
		arr[4] = 500;
		System.out.println(arr[4]); //다섯 번째 출력
		arr[2] = 200;
		System.out.println(arr[2]); // 세 번째 출력
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); //순서대로 출력
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + " : " + arr[i] + " ");
		}

	}

}
