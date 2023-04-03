package 생성자;

public class 컴퓨터조립하기 {

	public static void main(String[] args) {
		
		컴퓨터 노트북1 = new 컴퓨터("i7", 16, 512);
		컴퓨터 노트북2 = new 컴퓨터("i5", 18, 512);
		
		System.out.println(노트북1);
//		System.out.println(노트북1.cpu);
//		System.out.println(노트북1.ram);
//		System.out.println(노트북1.ssd);
		System.out.println(노트북2);
//		System.out.println(노트북2.cpu);
//		System.out.println(노트북2.ram);
//		System.out.println(노트북2.ssd);
	}

}
