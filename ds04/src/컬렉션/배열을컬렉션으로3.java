package 컬렉션;

import java.util.*;

public class 배열을컬렉션으로3 {

	public static void main(String[] args) {

		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		StringPrint(s2);
		
		List<String> list3 = new ArrayList<String>(Arrays.asList(s2));
		list3.add("hahaha");
		list3.remove("bbb");
		list3.set(0, "hohoho");
		System.out.println(list3);
		
		//다시 배열로!
		String[] answer = new String[list3.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list3.get(i);
		}
		StringPrint(answer);
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void StringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
	
}