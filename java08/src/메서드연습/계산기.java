package 메서드연습;

import java.io.PushbackInputStream;
import java.security.PublicKey;
import java.util.Random;

public class 계산기 {

	public void 더하기 (int x, int y) { //더하기(2,3)
		System.out.println("더하기 기능 처리 방법 내용");
		System.out.println(x + y);
	}
	
	public void 곱하기(int x, int y, int z) {
		System.out.println("곱하기 기능 처리 방법 내용");
		System.out.println(x * y * z);
	}
	
	public int 빼기(int x, int y) { //매개변수(parameter)
		//main으로 넘김
		System.out.println("빼기 기능 처리 방법 내용");
		return x - y;
	}

}
