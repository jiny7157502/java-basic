package 스레드;

public class 동시프로그램실행2 {	
	public static void main(String[] args) {
		스레드_1 t1 = new 스레드_1();
		스레드_2 t2 = new 스레드_2();
		스레드_3 t3 = new 스레드_3();
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
