package 복습;

public class Mask2 { //방법2
	//멤버변수
	String color;
	int price;
	int count;
	
	//클래스 이름과 동일한 메서드를 만들어주면 new를 가지고 객체생성시 자동호출
	//Generate Constructor using Fields
	//생성자(메서드) => constructor
	public Mask2(String color, int price, int count) {
		super(); //지워도됨
		this.color = color;
		this.price = price;
		this.count = count;
	}
	
	//출력방법 2
	@Override
	public String toString() {
		return "Mask(마스크) [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
}
