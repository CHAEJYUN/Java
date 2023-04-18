package 문자열;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		
		String all ="국어, 영어, 수학, 컴퓨터";
		
		// 1. String[]으로 바꾸어보세요
		String[] all2 = all.split(",");
		
		// 2. 공백제거 후 -> 다시 배열에
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].contains(" ")) {
				all2[i] = all2[i].trim();
			}
		}
		for (int i = 0; i < all2.length; i++) {
			System.out.print(all2[i]);
			System.out.println();
		}
		
		// 1 - 2.공백까지 한 번에 제거
//		String[] all2 = all.split(", ");
		
		// 3. 과목수?
		System.out.println(all2.length);
		
		// 4. 컴퓨터의 위치?
		for (int i = 0; i < all2.length; i++) {
			if(all2[i] == "컴퓨터") {
				System.out.println(i);
			}
		}
		
		// 5. 과목명이 3글지 미만인 과목수?
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count);
	}

}
