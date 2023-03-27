package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표JFrame {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 900);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel title = new JLabel("당신의 노래에 투표하세요!");
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		JLabel l6 = new JLabel();

		ImageIcon img1 = new ImageIcon("ok.png");
		ImageIcon img2 = new ImageIcon("no.png");
		ImageIcon img3 = new ImageIcon("016.png");

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();

		l1.setText("아이유");
		l3.setText("방탄소");
		l5.setText("뉴진스");

		b1.setIcon(img1);
		b2.setIcon(img2);
		b3.setIcon(img3);

		Font font1 = new Font("D2Coding", 1, 20);
		Font font2 = new Font("D2Coding", 1, 30);

		title.setFont(font2);
		l1.setFont(font1);
		l2.setFont(font2);
		l3.setFont(font1);
		l4.setFont(font2);
		l5.setFont(font1);
		l6.setFont(font2);

		f.add(title);

		f.add(b1);
		f.add(l1);
		f.add(l2);

		f.add(b2);
		f.add(l3);
		f.add(l4);

		f.add(b3);
		f.add(l5);
		f.add(l6);

		//버튼에 액션기능을 추가할 때는
		//1. 액션기능 추가==> b1.addActionListener
		//2. 버튼을 클릭했을 때 어떤 부품일 처리할지 부품 지정
		//   ==> new ActionListener()
		//3. 버튼을 클릭했을 때 처리 내용을 코딩
		// @Override
	//		public void actionPerformed(ActionEvent e) {
	//			//처리할 내용을 씀
	//		}
		
		b1.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				l2.setText(i + "표");
			}
		});

		b2.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				l4.setText(i + "표");
			}
		});

		b3.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				l6.setText(i + "표");
			}
		});

		f.setVisible(true);

	}
}
