package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 액션 {

	public static void main(String[] args) {
		
		JFrame frame  = new JFrame();
		frame.setSize(350, 200);
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("별 10개");
		JButton b2 = new JButton();
		b2.setText("버튼");
		JButton b3 = new JButton();
		
		Font font = new Font("돋움", 1, 45);
		b1.setFont(font);
		b2.setFont(font);

		frame.add(b1);
		frame.add(b2);
		
		//(1)버튼에다가 액션기능을 추가
		//(2)클릭액션이 있을 때 어떤 부품이 어떻게 액션을 처리할지
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭시 * 10개 출력
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭시 아래문구 출력
				System.out.println("b2를 클릭");

			}
		});
		frame.setVisible(true);
	}

}
