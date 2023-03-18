package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator2 {

	public static void main(String[] args) {

		//프레임
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.setTitle("계산기");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//폰트
		Font font = new Font("돋움", 1, 30);

		//이미지
		ImageIcon icon = new ImageIcon("calculator.jpg");
		JLabel label1 = new JLabel();
		label1.setIcon(icon);

		//숫자1
		JLabel label2 = new JLabel("숫자1");
		//라벨에 바로 적어줘도 되고
		
		//숫자2
		JLabel label3 = new JLabel();
		label3.setText("숫자2"); //요로케 적어도 되고

		//숫자 입력받는 칸
		JTextField text1 = new JTextField(9);
		JTextField text2 = new JTextField(9);

		//사칙연산 버튼들
		JButton b = new JButton();
		b.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		//폰트 설정
		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		b.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		//화면에 추가
		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		//색상 설정
		label2.setForeground(Color.blue);
		label3.setForeground(Color.blue);
		text1.setBackground(Color.yellow);
		text2.setBackground(Color.yellow);
		b.setForeground(Color.white);
		b.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b3.setBackground(Color.blue);
		b4.setForeground(Color.white);
		b4.setBackground(Color.blue);

		//버튼 눌렀을 때 함수
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				// text1, text2에 있는 글자를 가지고 옴
				String n1 = text1.getText();
				String n2 = text2.getText();

				//입력받는 값 무조건 String이라서 형변환 필요
				//int로 변환
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				int result = n11 + n22;
				//계산 결과 창에 띄어줌
				JOptionPane.showMessageDialog(f, result);
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String n1 = text1.getText();
				String n2 = text2.getText();

				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				int result = n11 - n22;
				JOptionPane.showMessageDialog(f, result);
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String n1 = text1.getText();
				String n2 = text2.getText();

				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				int result = n11 * n22;
				JOptionPane.showMessageDialog(f, result);
			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String n1 = text1.getText();
				String n2 = text2.getText();

				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				//실수로 나타내기
				//하나라도 실수면 결과도 실수
				double result = n11 / (double)n22;
				//소수 3자리까지
				JOptionPane.showMessageDialog(f, String.format("%3.3f", result));
				//그냥 "%3"이면 소수 최대 6자리까지 출력
			}
		});

		f.setVisible(true);
	}

}
