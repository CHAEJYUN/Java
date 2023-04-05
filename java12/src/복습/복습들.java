package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 복습들 {
	
	public static void main(String[] args) {
		//박싱 = 기본타입 -> Wrapper클래스(포장클래스)
		//언박싱 = Wrapper클래스 -> 기본타입
		//오토박싱/언박싱 => 자바에서 자동으로 처리
		
		ArrayList list = new ArrayList();
		
		list.add("홍길동"); //자동형변환 = String -> Object
		
		list.add(100); //오토박싱 => int(기본형)이 -> 래퍼클래스(Integer)를 통해 -> Object
		
		list.add(11.22); //Object <- Double(래퍼클래스) <- 오토박싱 - double(기본형)
		
		list.add(new JButton()); //Object <- Jbutton
		
		String name = (String)list.get(0); //String <- Object
		//직접 접근, 랜덤액세스 가능, 강제형변환 
		
		int age = (Integer)list.get(1); //int <- Integer <- Object = 오토언박싱, 강제형변환
	}

}
