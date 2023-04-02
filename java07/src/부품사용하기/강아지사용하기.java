package 부품사용하기;

import 부품만들기.강아지;
import 부품만들기.전화기;

public class 강아지사용하기 {

	public static void main(String[] args) {
		
		강아지 dog = new 강아지();
		dog.age = 2;
		dog.family = "채지윤";
		dog.산책한다();
		dog.짖는다();
		System.out.println("dog의 나이 : " + dog.age);
		System.out.println("dog의 가족 : " + dog.family);
	}

}
