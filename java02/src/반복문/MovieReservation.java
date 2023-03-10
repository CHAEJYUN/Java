package 반복문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MovieReservation {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(300, 850);
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		for (int i = 0; i < 100; i++) {
			JButton button = new JButton("좌석");
			frame.add(button);
		}
		frame.setVisible(true);
	}

}
