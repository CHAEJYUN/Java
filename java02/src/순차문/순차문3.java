package 순차문;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		
		String data1 = JOptionPane.showInputDialog("키 입력");
		String data2 = JOptionPane.showInputDialog("몸무게 입력");
		
		double data3 = Double.parseDouble(data1);
	    double data4 = Double.parseDouble(data2);
		
		double result = (data3 - data4) *0.9; //결과는 String
		
		System.out.println(result); //콘솔에 출력
		JOptionPane.showMessageDialog(null, result); //창에 출력
	}

}
