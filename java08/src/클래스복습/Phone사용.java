package 클래스복습;

public class Phone사용 {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		phone1.model = "갤럭시";
		System.out.println(phone1.model);
		phone1.call();
		phone1.talk();
		
		Phone phone2 = new Phone();
		phone2.model = "아이폰";
		System.out.println(phone2.model);
		phone1.call();
		phone1.talk();
	}

}
