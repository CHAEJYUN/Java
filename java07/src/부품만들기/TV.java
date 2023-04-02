package 부품만들기;

//main 밑에 쓰면 지역변수

public class TV {
	//멤버변수 => 선언이 클래스 바로 아래에 되었기 때문에 클래스 전체 영역에서 변수 사용가능
	//전역변수(global변수)
	//멤버변수는 자동초기화, 전역변수는 자동초기화
	public int ch; //0
	public int vol; //0
	public boolean onOff; //false
	
	public void 채널을바꾸다() {
		int change = 1; //지역변수, local변수, 자동초기화NO
		System.out.println(ch + "에서 " + change + "로 바꾸다");
	}
	//메서드 정의
	public void 유튜브보다() {
		System.out.println(vol + "을 키워서 동영상을 보다");
	}

}
