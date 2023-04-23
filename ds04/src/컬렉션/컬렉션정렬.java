package 컬렉션;

import java.util.*;

public class 컬렉션정렬 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(600);
		list.add(100);
		list.add(300);
		list.add(400);
		list.add(200);
		list.add(500);
		
		System.out.println(list);
		Collections.sort(list); //정렬
		System.out.println(list);
		Collections.reverse(list); //뒤집엉
		System.out.println(list);
		
		//리스트에 있는 값들을 배열을 만들어 넣
		int[] array = new int[list.size()];
		for(int i = 0; i < array.length; i++) {
			array[i] = list.get(i);
		}
		System.out.println(Arrays.toString(array));
		
		array[0] = 1000;
		
		//수정된 배열을 arraylist를 새로 만들어 넣은 후 프린트ㄴ
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list2.add(array[i]);
		}
		System.out.println(list2);
	}

}
