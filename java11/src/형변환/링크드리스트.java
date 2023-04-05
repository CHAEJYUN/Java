package 형변환;

import java.util.LinkedList;

public class 링크드리스트 {

	public static void main(String[] args) {
		//3. LinkedList = Queue
		//먼저 들어온 요소가 먼저 나감
		LinkedList day = new LinkedList();
		day.add("1일차");
		day.add("2일차");
		day.add("3일차");
		System.out.println(day);
		day.remove(); //1일차 나감
		System.out.println(day);
		day.remove(); //2일차 나감
		System.out.println(day);
	}

}
