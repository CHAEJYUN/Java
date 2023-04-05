package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 해시셋 {

	public static void main(String[] args) {
		//2. HashSet
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		System.out.println(bag);
		bag.add("볼펜"); //중복제거
		System.out.println(bag);
	}

}
