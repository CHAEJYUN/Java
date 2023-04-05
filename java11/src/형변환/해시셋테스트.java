package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 해시셋테스트 {

	public static void main(String[] args) {
		// 로또문제
		Random r = new Random(42);
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; i < 10; i++) {
			lotto.add(r.nextInt(1000));
		}
		
		System.out.println(1000 - lotto.size());
		System.out.println();
	}

}
