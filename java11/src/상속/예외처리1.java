package 상속;

public class 예외처리1 {

	public static void main(String[] args) {
		//실행할 때 에러가 발생해서 프로그램이 멈추는 것을 막기 위한 것
		System.out.println("1. 나는 프린트될 거야");
		
		try {
			//에러가 발생할 거 같은 코드
			System.out.println("2. 문제 발생 코드 : " + 10/0);
		} catch (Exception e) {
			//문제가 발생했을 때 프로그램을 멈추지 않고 어떻게 처리할지
			System.out.println("3. 나는 과연 프린트될까요?");
		}
	}

}
