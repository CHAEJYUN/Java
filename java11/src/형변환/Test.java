package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		//1.
		HashSet travel = new HashSet();
		travel.add("도쿄");
		travel.add("오사카");
		travel.add("후쿠오카");
		travel.add("오키나와");
		travel.add("삿포로");
		System.out.println(travel);
		
		//2.
		HashMap house = new HashMap();
		house.put("안방", "TV");
		house.put("거실", "소파");
		house.put("부엌", "냉장고");
		house.put("현관", "신발");
		System.out.println(house);
		System.out.println(house.get("현관"));
		house.replace("거실", "책상");
		System.out.println(house);
		
		//3.
		ArrayList list = new ArrayList();
		list.add("수업듣기");
		list.add("복습하기");
		list.add("휴식취하기");
		list.add("밥먹기");
		list.add("잠자기");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		list.set(1, "청소하기");
		System.out.println(list);
		//Array리스트를 Linked보다 훨 더 많이 씀!!!!!!!!!!!!!@
	}

}
