package 부품응용하기;

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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(350, 500);
		f.getContentPane();

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", 1, 30);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아    이    디 : ");
		JLabel pw = new JLabel("패  스  워  드 : ");
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("id.png");
		ImageIcon icon3 = new ImageIcon("pw.png");
		top.setIcon(icon1);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setHorizontalAlignment(JTextField.CENTER);
		pwText.setHorizontalAlignment(JTextField.CENTER);
		id.setFont(font);
		pw.setFont(font);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.gray);
		reset.setBackground(Color.gray);

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//reset을 눌렀을 때 idText, pwText에 공백을 넣어라
				idText.setText("");
				pwText.setText("");
			}
		});
		
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//idText, pwText에 getText()
				String id2 = idText.getText(); //"root"
				String pw2 = pwText.getText(); //"1234"
				//root/1234인지 비교해서 로그인 성공/실패 JOptionpane으로 출력
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					//일기장의 open()기능 쓰자
					일기장쓰기 diary = new 일기장쓰기();
					diary.open(); //메서드 사용 => 메서드 호출
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		
		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		f.setVisible(true);
	}

}
