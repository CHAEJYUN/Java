package 컬렉션;

import java.util.*;

public class 배열을컬렉션으로 {

	public static void main(String[] args) {

		int[] s = { 5, 2, 1, 9, 17, 15, 11 };
		intPrint(s);
		Arrays.sort(s); // 파괴함수
		//System.out.println(Arrays.toString(s));
		intPrint(s);
		
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		StringPrint(s2);
		
		// 1. 배열 aaa가 궁금해요
		//List로 변형하면 다양한 처리들을 for문 사용하지 않고도 가능하다
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
		System.out.println(list.contains("aaa"));
		// 2. bbb 삭제
		//System.out.println(list.remove("bbb"));
		// 3. ccc 위치
		System.out.println(list.indexOf("ccc"));
		// 4. aaa 마지막 위치
		System.out.println(list.lastIndexOf("aaa"));
		// 5. 맨 앞에 ddd 삽입
		//list.add(0, "ddd");
		// 6. 맨 뒤에 fff 삽입
		// 7. 인덱스 2번의 내용을 ggg로 변경
		list.set(2, "ggg");
		// 8. 전체 프린트
		System.out.println(list);
		
		//삽입 및 삭제가 안 되는 것 2, 5, 6
		//제약이 없는 ArrayList를 다시 만들어주면 된다(모든 기능 가능)
		List<String> list2 = new ArrayList<String>(Arrays.asList(s2));
		list2.add("hahaha");
		list2.remove("bbb");
		System.out.println(list2);
		
		//배열에 한계가 있어서 리스트를 사용하는데
		//코테에서는 거의 배열로 함
		String[] s3 = (String[])list.toArray();
		StringPrint(s3);
	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void StringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
	
}