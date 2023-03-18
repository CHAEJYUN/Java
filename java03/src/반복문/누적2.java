package 반복문;

import javax.swing.JOptionPane;

public class 누적2 {

	public static void main(String[] args) {
		//5 ~ 300 사이의 5의 배수만 모두 더해 출력
		int sum = 0;
		
		for (int i = 5; i <= 300; i++) {
			
			if (i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
