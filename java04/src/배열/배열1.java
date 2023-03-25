package 배열;

public class 배열1 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고 CPU가 접근해 사용하고 싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
	    int[] jeongsu = {10, 20, 30, 40}; //length를 만들어 몇개인지 세서 값 넣어줌 4개 + length => 5개
	    System.out.println(jeongsu); // 주소
	    System.out.println(jeongsu[0]); // 첫 번째 값
	    System.out.println(jeongsu[1]);
	    System.out.println(jeongsu[2]);
	    System.out.println(jeongsu[3]);
	    System.out.println(jeongsu.length);
	    
	    jeongsu[0] = 100;
	    System.out.println(jeongsu[0]);
	    
	    // 2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어주고 값을 나중에 넣는 경우
	    int[] j2 = new int[4]; // 공간 먼저 만들고
	    j2[0] = 100; // 값을 넣음
	    System.out.println(j2[0]);
	    
	    // 3. 배열과 반복문
	    int [] x = new int[10];
	    x[0] = 77;
	    x[1] = 88;
	    // 반복문 쓰면 바로 위의 배열 가져옴
	    for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]); // 가로로 하려면 print 쓰고 " " 넣어주기
		}
	}

}
