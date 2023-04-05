package 인터페이스;

public class Computer사용2 {

	public static void main(String[] args) {
		//익명클래스
		//Computer com = new Computer();
		//인터페이스는 불완전하기 때문에 이것을 틀로 해서 객체생성 불가능
		Computer com = new Computer() {
			
			@Override
			public void SSD를추가한다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void RAM을추가한다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void CPU를추가한다() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
