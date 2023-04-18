package 문자열;

public class test심화 {

	public static void main(String[] args) {
		
		String s5 = "[  10, 20, 30, 40, 50]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		System.out.println(s5);
		
		s5 = s5.trim();
		System.out.println(s5);
		String[] s55 = s5.split(","); //나누기ㅣㅣㅣㅣㅣㅣㅣ
		
		int sum = 0;
		for (String x : s55) {
			int n = Integer.parseInt(x);
			sum = sum + n;
		}
		System.out.println(sum);
	}

}
