package 인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void CPU를추가한다() {
		System.out.println("i7 CPU를 추가한다");
		
	}

	@Override
	public void RAM을추가한다() {
		System.out.println("16GB RAM을 추가한다");
		
	}

	@Override
	public void SSD를추가한다() {
		System.out.println("256GB SSD를 추가한다");
		
	}

}
