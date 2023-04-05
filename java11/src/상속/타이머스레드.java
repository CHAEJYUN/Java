package 상속;

public class 타이머스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 50; i > 0; i--) {
			System.out.println("타이머 : " + i);
		
			try {
				Thread.sleep(1000); //1초 재워라
			} catch (Exception e) {
				System.out.println("CPU 연결 문제 생김");
			}
		}
	}
	
}
