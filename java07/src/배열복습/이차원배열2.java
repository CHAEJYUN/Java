package 배열복습;

public class 이차원배열2 {

	public static void main(String[] args) {
		
		String[][] s = {
				{"C","JAVA","PYTHON"},
				{"치킨","피자","파스타"},
				{"독서","음악","영화"}
				};
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}
