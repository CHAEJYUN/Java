package 배열응용2;

public class 성적변동 {

	public static void main(String[] args) {
		
		int[] n1 = {44, 66, 77, 22, 11};
		int[] n2 = {33, 66, 66, 22, 44};
		
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) {
				count1++;
			} else {
				count2++;
			}
		}
		
		System.out.println("성적이 동일한 학생 수 : " + count1 + "명");
		System.out.println("성적이 동일하지 않은 학생 수 : " + count2 + "명");

	}

}
