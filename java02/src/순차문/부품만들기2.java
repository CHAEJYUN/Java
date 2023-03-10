package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		
		//FlowLayout
		//물 흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		
		JButton b2 = new JButton();
		b2.setText("나는 버튼2");
		
		JLabel text1 = new JLabel(); //글씨
		text1.setText("아이디");
		
		JLabel text2 = new JLabel(); //글씨
		text2.setText("패스워드");
		
		//글자 넣는 칸
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("돋움", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		
		//파일명을 쓰면 자바 프로젝트 바로 아래 있는 것으로 인식
		ImageIcon icon1 = new ImageIcon("이미지1.png");
		ImageIcon icon2 = new ImageIcon("이미지2.png");
				
		//버튼에 이미지 추가
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		
		//f창에 추가
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);
	}

}
