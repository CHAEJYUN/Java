package 컬렉션;

import java.util.*;

public class 배열을컬렉션으로2 {

	public static void main(String[] args) {
		
		String[] 냉장고음식 = {"감자", "고구마", "우유", "감자", "양파"};
		StringPrint(냉장고음식);
		List<String> list = Arrays.asList(냉장고음식);
		
		// 1. 감자가 들어있는 마지막 위치를 구해보세요. 전체 출력 
		System.out.println(list.lastIndexOf("감자"));
		StringPrint(냉장고음식);
		// 2. 양파를 포함하고 있으면 "양파는 안사도 된다", 
		//         포함하고 있지 않으면 없으면 "양파 사서 냉장고에 넣어야 한다."
		//		   전체 출력
		if(list.contains("양파")) {
			System.out.println("양파는 안 사도 된다");
		}else {
			System.out.println("양파 사서 냉장고에 넣어야 한다");
		}
		
		// 3. 우유를 "춘식이 우유"로 수정해보자. 전체출력
		list.set(2, "춘식이우유");
		StringPrint(냉장고음식);
		// 4. 양파를 찾아서 위치를 찾은 후, 해당 위치에 "양파즙"이라고 수정하자.
		//    전체출력
		System.out.println(list.indexOf("양파"));
		list.set(4, "양파즘");
		StringPrint(냉장고음식);
		
		// 배열의 상태는?
		System.out.println("배열의 상태는?");
		StringPrint(냉장고음식); //배열과 리스트에 연결되어 있ㄷ
		
		// 5. 다시 배열로 변환하여 전체 내용을 출력
//		String[] 냉장고음식2 = (String[])list.toArray();
//		StringPrint(냉장고음식2);
	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void StringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
	
}