package 메서드연습;

public class 계산기2 {
	//메서드 이름을 입력값이 다르면 다 동일하게 써도 됨
	//하나의 이름으로 다양한 형태를 구현 가능함
	//=> 다형성(오버로딩)
	public int add(int x, int y) {
		return x + y;
	}
	public double add(int x, double y) {
		return x + y;
	}
	public double add(double x, double y) {
		return x + y;
	}
	public String add(int x, String y) {
		return x + y;
	}

}
