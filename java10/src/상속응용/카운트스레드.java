package 상속응용;

import java.util.Date;

public class 카운트스레드 extends Thread {

	@Override
	public void run() {
		for (int i = 50; i > 0; i--) {
			Date date = new Date();
			System.out.println("타이머 : " + date);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("CPU 연결 문제 생김");
			}
		}
	}
	
}
