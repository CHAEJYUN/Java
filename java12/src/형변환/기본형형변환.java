package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		
		byte a = 100; //1바이트, -128 ~ 127
		int b = 200; //4바이트, -21억 ~ 21억
		
		b = a; //큰 <- 작, 자동으로 형변환(자동형변환)
		
		a = (byte)b; //작 <- 큰, 강제로 형변환(강제형변환)
		
		//double(큰, 10.0) <- int(작, 10)
		double c = b; //자동형변환
		b = (int)c; //강제형변환
		
		int d = 2000;
		//byte의 범위를 넘어선 127이상의 숫자는 강제형변환하지 말아야 함
		byte e = (byte)d; 
	}
	
}
