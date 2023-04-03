package 생성자;

public class 직원 {
	
	String name;
	int age;
	String sex;
	static int count;
	static int sum;
	
	//객체 생성하지 않고 클래스 이름으로 바로 접근해서 원할 때마다 평균을 구하고 싶은 경우
	//static 메서드를 만들어주세요
	public static void getAvg() {
		//static 메서드에서 전역변수를 접근할 때는
		//같은 성격을 가진 static 변수만 접근이 가능
		//System.out.println(name);은 안됨
		System.out.println(sum /count);
	}
	
	public 직원(String name, int age, String sex) {
		count++;
		sum = sum + age;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}
