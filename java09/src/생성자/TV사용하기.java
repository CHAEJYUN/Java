package 생성자;

//같은 패키지에 있으면 임포트 안 해도OK

public class TV사용하기 {

	public static void main(String[] args) {
		
		TV tv1 = new TV(10, 9, true);
//		tv1.ch = 10;
//		tv1.vol = 9;
//		tv1.onOff = true;
		tv1.채널을바꾸다();
		System.out.println(tv1.ch + " " + tv1.vol + tv1.onOff);
		System.out.println(tv1);
		
		TV tv2 = new TV();
		tv2.ch = 20;
		tv2.vol = 15;
		tv2.onOff = false;
		tv2.유튜브보다();
		System.out.println(tv2.ch + " " + tv2.vol + tv2.onOff);
	}

}
