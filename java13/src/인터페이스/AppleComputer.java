package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void CPU를추가한다() {
		
		System.out.println("i5 CPU를 추가한다");
	}

	@Override
	public void RAM을추가한다() {
		
		System.out.println("8GB RAM을 추가한다");
	}

	@Override
	public void SSD를추가한다() {
		
		System.out.println("128GB SSD를 추가한다");
	}

}
