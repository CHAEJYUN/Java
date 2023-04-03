package 생성자;

public class 컴퓨터 {
	
	String cpu;
	int ram;
	int ssd;

	public 컴퓨터(String cpu, int ram, int ssd) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}

	@Override
	public String toString() {
		return "컴퓨터 [cpu=" + cpu + ", ram=" + ram + ", ssd=" + ssd + "]";
	}

}
