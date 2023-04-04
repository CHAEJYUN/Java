package 상속기본;

public class 커피숍 {

	public static void main(String[] args) {
		
		매니저 m = new 매니저();
		m.name = "홍길동";
		m.address = "강남구";
		m.rrn  = "888888";
		m.bonus = 50;
		m.test();
		
		System.out.println(m.name);
		System.out.println(m.address);
		System.out.println(m.rrn);
		System.out.println(m.bonus);
	}

}
