package 상속활용;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;

public class 스레드그래픽 extends JFrame {
	JLabel count, image, day;
	카운터스레드2 count2;
	시각스레드2 day2;
	이미지스레드2 image2;
	static 스레드그래픽 f;
	
	public 스레드그래픽() {
		getContentPane().setBackground(Color.MAGENTA);
		setSize(800, 300);
		count = new JLabel("카운터");
		image = new JLabel("이미지");
		day = new JLabel("시각");
		Font font = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		day.setFont(font);
		image.setFont(font);
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		setVisible(true);
		
		count2 = new 카운터스레드2();
		count2.start();
		
		day2 = new 시각스레드2();
		day2.start();
		
		image2 = new 이미지스레드2();
		image2.start();
	}

	public static void main(String[] args) {
		f = new 스레드그래픽();
	}
	
	//이너클래스(내부클래스)
	//외부 다른 클래스에서 이 내부클래스를 직접 객체 생성불가
	//변수를 공유할 목적으로 클래스내에 다른 클래스를 끼워넣을 수 있음.
	//잘 사용되지는 않음.
	public class 카운터스레드2 extends Thread {

		@Override // 표시@ == annotation(어노테이션, 표시)
		public void run() {
			for (int i = 10; i >= 0; i--) {
				//System.out.println("카운트 >> " + i);
				count.setText("카운트 >> " + i);
				
				// cpu가 한꺼번에 너무 많이 실행해버려서, 다른 스레드랑 동시에 처리되는 것처럼 보이지 않음.
				// cpu 1초씩 쉬었다가 실행시켜줘라고 설정

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 밀리세켠즈 1000 == 1초
					// 자바프로그램에서 외부자원(db, cpu, network, file)을 연결할 때는
					// 프로그램이 중단되는 위험한 상황으로 인식되어
					// 그런 상황이 발생했을 때 어떻게 할지를 반드시!! 써주어야함.
					// 예외처리
				if (i == 0) {
					JOptionPane.showMessageDialog(null, "사용시간이 다 되었습니다. 퇴실부탁드립니다.");
					image2.stop();
					day2.stop();
//					int hour = Calendar.HOUR;
				}
			}
		}
	}
//  자식클래스 extends 부모클래스
	public class 시각스레드2 extends Thread {

		@Override // 표시@ == annotation(어노테이션, 표시)
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();
//				System.out.println("시각 >> " + date);
				day.setText("시각 >> " + date);
				// cpu가 한꺼번에 너무 많이 실행해버려서, 다른 스레드랑 동시에 처리되는 것처럼 보이지 않음.
				// cpu 1초씩 쉬었다가 실행시켜줘라고 설정

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 밀리세켠즈 1000 == 1초
					// 자바프로그램에서 외부자원(db, cpu, network, file)을 연결할 때는
					// 프로그램이 중단되는 위험한 상황으로 인식되어
					// 그런 상황이 발생했을 때 어떻게 할지를 반드시!! 써주어야함.
					// 예외처리
				
			}
		}
	}
	
	public class 이미지스레드2 extends Thread {

		@Override // 표시@ == annotation(어노테이션, 표시)
		public void run() {
			String[] list = {"1.png","2.png","3.png","4.png","5.png"};
			for (int i = 0; i < list.length; i++) {
//				System.out.println("이미지 >> " + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				// cpu가 한꺼번에 너무 많이 실행해버려서, 다른 스레드랑 동시에 처리되는 것처럼 보이지 않음.
				// cpu 1초씩 쉬었다가 실행시켜줘라고 설정

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 밀리세켠즈 1000 == 1초
					// 자바프로그램에서 외부자원(db, cpu, network, file)을 연결할 때는
					// 프로그램이 중단되는 위험한 상황으로 인식되어
					// 그런 상황이 발생했을 때 어떻게 할지를 반드시!! 써주어야함.
					// 예외처리
			}
		}
	}

}
