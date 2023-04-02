package 키오스크;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 키오스크 {
	
	static int count; //0으로 초기화, 전역변수
	static int count1; //짬
	static int count2; //우
	static int count3; //짜
	final static int PRICE = 5000; //final은 변경불가, 상수
	final static int PRICE1 = 3500; //final은 변경불가, 상수
	final static int PRICE2 = 3000; //final은 변경불가, 상수
	final static int PRICE3 = 4000; //final은 변경불가, 상수
	//상수변수를 쓸 때는 잘 보이라고 쓰는 것, 변수명을 모두 대문자로 권장
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("음식 주문 시스템");
		f.setSize(600, 550);
		f.getContentPane().setBackground(Color.white);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("D2Cding", Font.ITALIC, 30);
//		Font font2 = new Font("D2Cding", 1, 20);
		
		JLabel textLabel = new JLabel("     개수 : ");
		textLabel.setFont(font1);
		
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font1);
		
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("중국집.png");
		imgLabel.setIcon(icon);
		
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font1);
		
		JButton b1 = new JButton("짬뽕");
		b1.setFont(font1);
		b1.setBackground(Color.pink);
		b1.setBorderPainted(false);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짬.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("짬뽕 : " + count1 + "개 우동 : " + count2 + "개 짜장 : " + count3 + "개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("결제금액 " + total + "원");
			}
		});
		
		JButton b2 = new JButton("우동");
		b2.setFont(font1);
		b2.setBackground(Color.orange);
		b2.setBorderPainted(false);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("우.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count2++;
				f.setTitle("짬뽕 : " + count1 + "개 우동 : " + count2 + "개 짜장 : " + count3 + "개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("결제금액 " + total + "원");
			}
		});
		
		JButton b3 = new JButton("짜장");
		b3.setFont(font1);
		b3.setBackground(Color.blue);
		b3.setBorderPainted(false);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짜.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count3++;
				f.setTitle("짬뽕 : " + count1 + "개 우동 : " + count2 + "개 짜장 : " + count3 + "개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("결제금액 " + total + "원");
			}
		});
		
		f.add(b1); f.add(b2); f.add(b3);
		f.add(textLabel); f.add(countLabel); f.add(imgLabel); f.add(result);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}