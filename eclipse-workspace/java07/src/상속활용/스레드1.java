package 상속활용;

public class 스레드1 extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("스레드 1 >> " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
