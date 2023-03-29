package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		
		String[] hobby = {"run", "book", "swim", "walk"};
		//hobby : 참조형변수, 주소가 들어있음
		System.out.println(hobby);
		System.out.println(hobby[0]);
		System.out.println(hobby[1]);
		System.out.println(hobby[2]);
		System.out.println(hobby[3]);
		System.out.println(hobby.length);
		System.out.println(hobby.length - 1);
		
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(hobby[i]);
		}
		
		System.out.println("-------------------");

		//for-each문 : 알아서 첨부터 인덱스를 하나씩 증가시키며 하나씩 꺼내옴
		for (String x : hobby) {
			System.out.println(x);
		}
	}

}
