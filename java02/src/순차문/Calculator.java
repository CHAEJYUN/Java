package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(230, 250);
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		JLabel label1 = new JLabel();
		label1.setText("숫자1");
		
		JLabel label2 = new JLabel();
		label2.setText("숫자2");
		
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		
		Font font = new Font("돋움", 1, 20);
		
		JButton button1 = new JButton();
		button1.setText("+");
		JButton button2 = new JButton();
		button2.setText("-");
		JButton button3 = new JButton();
		button3.setText("*");
		JButton button4 = new JButton();
		button4.setText("/");
		
		label1.setFont(font);
		label2.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		button1.setFont(font);
		button2.setFont(font);
		button3.setFont(font);
		button4.setFont(font);
		
		frame.add(label1);
		frame.add(text1);
		frame.add(label2);
		frame.add(text2);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		
		label1.setForeground(Color.blue);
		label2.setForeground(Color.blue);
		text1.setForeground(Color.green);
		text1.setBackground(Color.yellow);
		text2.setForeground(Color.green);
		text2.setBackground(Color.yellow);
		button1.setForeground(Color.white);
		button1.setBackground(Color.blue);
		button2.setForeground(Color.white);
		button2.setBackground(Color.blue);
		button3.setForeground(Color.white);
		button3.setBackground(Color.blue);
		button4.setForeground(Color.white);
		button4.setBackground(Color.blue);
		
		frame.setVisible(true);
	}

}
