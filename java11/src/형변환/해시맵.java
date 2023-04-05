package 형변환;

import java.util.HashMap;

public class 해시맵 {

	public static void main(String[] args) {
		//4. map.put(키, 값)
		HashMap map = new HashMap();
		map.put("사과", "apple");
		map.put("멜론", "melon");
		map.put("물", "water");
		System.out.println(map);
		System.out.println(map.get("사과")); //get(키)
		System.out.println("물");
		System.out.println(map);
		map.replace("멜론", "melons");
		System.out.println(map);
	}

}
