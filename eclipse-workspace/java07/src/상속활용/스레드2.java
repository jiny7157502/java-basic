package 상속활용;

public class 스레드2 extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("스레드 2 >> " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
