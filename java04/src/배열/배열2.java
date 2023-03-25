package 배열;

public class 배열2 {

	public static void main(String[] args) {
		// String배열
		double[] height = {123.4, 234.2, 124.5};
		double[] space = new double[500];
		char[] gender = {'남', '여', '남'};
		String[] space2 = new String[333];
		
		// null값 알아보기
		String[] n = new String[3];
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
	}

}
