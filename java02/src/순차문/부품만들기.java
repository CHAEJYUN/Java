package 순차문;

//import javax.swing.*; //swing의 여러가지 부품 임포트? 
import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기 {

	public static void main(String[] args) {
		//자주 사용하지 않는 부품을 만들어보자
		//'틀'이 있어서 그 틀을 가지고 찍어서 필요한 부품을 만들어 CPU가 조립
		//new: 틀을 가지고 찍어낼 때 사용
		//new JFrame()은 JFrame이라는 틀을 사용해서 부품을 찍어냄
		//만든 부품은 모두 다 RAM에 저장
		//그래서 f라는 변수를 만들어 부품을 넣어줘야함
		//f에는 JFrame이 저장되어야함
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		
		f.add(b1);
		
		//보여주는 것은 맨 끝으로
		f.setVisible(true);
	}

}
