package 문자열;

public class 함수만들기2 {
	
	public static void 밥먹기(String when) {
		for (int i = 0; i < 10; i++) {
			System.out.println(when + "밥을 먹는다");
			System.out.println(when + "반찬을 먹는다");
		}
	}
	public static void 운동하기(String location) {
		System.out.println("운동화 착용");
		System.out.println(location + "에서 운동을 한다");
	}
	public static void 잠자기(String when) {
		System.out.println(when + "에 불을 끈다");
		System.out.println(when + "에 잠을 잔다");
	}
	
	public static void main(String[] args) {
		//1.
		System.out.println("세수를 한다");
		
		//2.
		밥먹기("아침");
		
		//3.
		운동하기("운동장");
		
		//4.
		잠자기("점심");
		
		//5.
		밥먹기("점심");
		
		//6.
		System.out.println("세수를 또 한다");
		
		//7.
		밥먹기("저녁");
		
		//8.
		운동하기("헬스장");
		
		//9.
		잠자기("저녁");
	}

}
