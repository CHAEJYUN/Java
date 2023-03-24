package 배열;

public class 배열1문제 {

	public static void main(String[] args) {
		// 문제1.
		// (1) 배열에 일주일간 공부한 시간을 저장해보세요
		int[] week = {1,2,3,4,5,6,7};
		// (2) 첫 번째 위치와 두 번째 위치 값을 출력
		System.out.println(week[0]);
		System.out.println(week[1]);
		// (3) week배열에 들어있는 데이터 수 출력
		System.out.println(week.length);
		// (4) 세 번째 위치 값을 10으로 넣어주세요, 다섯 번째 위치 값을 12로 넣어주세요
		week[2] = 10;
		week[4] = 12;
		// (5) 세 번째, 다섯 번째 위치 값을 출력
		System.out.println(week[2]);
		System.out.println(week[4]);
		
		// 문제2.
		// (1) 배열을 처음 만들 때 값을 모름, 배열이름은 tour, 크기는 4개
		int [] tour = new int[4];
		// (2) 첫 번째 인덱스에 20, 세 번째 인덱스에 30을 넣고 출력
		tour[0] = 20;
		tour[2] = 30;
		System.out.println(tour[0]);
		System.out.println(tour[2]);
		// (3) tour변수의 개수를 출력
		System.out.println(tour.length);
	}

}
