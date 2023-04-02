package 배열복습;

public class 이차원배열1 {

	public static void main(String[] args) {
		//값을 알고 만들 때
		int [][] n1 = {
		//j      0  1  2       i
				{1, 2, 3},   //0
				{4, 5, 6, 7} //1
		};
		System.out.println(n1.length); //2차원 배열의 length(행), 2개
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1.length; j++) {	
			}
		}
		
		//공간 먼저 만들 때
		int[][] n2 = new int[2][3];
	}

}
