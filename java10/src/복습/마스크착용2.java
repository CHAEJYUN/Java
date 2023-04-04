package 복습;

public class 마스크착용2 {

	public static void main(String[] args) {
		//방법 2
		Mask2 mask2 = new Mask2("하얀색", 1000, 3); //객체생성
		//멤버변수 값을 매번 줌(방법 1)
		//=> 객체생성시 멤버변수 값을 자동으로 무조건 넣어주는 처리를 하고 싶음(방법 2)
		
		System.out.println(mask2); //만 쓰면 (참조형)주소가 찍혀버림
		//Mask 가서 toString 찍어줘야함
	}

}
