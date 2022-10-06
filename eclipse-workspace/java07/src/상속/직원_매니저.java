package 상속;

public class 직원_매니저 {
	public static void main(String[] args) {
		매니저 m = new 매니저();
		m.name = "홍길동";
		m.address = "부산시";
		m.rrn = 123456;
		m.salary = 1000;
		m.bonus = 500;
		
		System.out.println(m);
		m.test();
	}	
}
