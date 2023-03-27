package 배열;

public class 배열2 {

	public static void main(String[] args) {
		// double형
		double[] height = {123.4, 234.2, 124.5};
		double[] space = new double[500];
		space[0] = 1111111.1111111;
		System.out.println(space[0]);
		
		// char형
		char[] gender = {'남', '여', '남'};
		
		// String배열
		String[] space2 = new String[333];
		space2[0] = "안녀엉";
		System.out.println(space2[0]);
		
		// null값 알아보기
		String[] n = new String[3];
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		
		//boolean형
		boolean[] a = {true, false, true, false};
	}

}
