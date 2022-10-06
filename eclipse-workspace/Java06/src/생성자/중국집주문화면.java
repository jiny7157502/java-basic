package 생성자;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class 중국집주문화면 {
	static JLabel result;
	static final int total = 5000;
	static int 짬뽕count = 0;
	static int 짜장count = 0;
	static int 우동count = 0;
	
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(SystemColor.info);
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수: ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 27));
		lblNewLabel.setBounds(444, 29, 90, 53);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(519, 29, 237, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		result = new JLabel("결제금액");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 26));
		result.setBounds(89, 399, 353, 62);
		f.getContentPane().add(result);
		
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(SwingConstants.CENTER);
		center.setIcon(new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\Java06\\짬뽕.jpg"));
		center.setBounds(89, 112, 621, 282);
		f.getContentPane().add(center);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				짬뽕count++;
				
				//현재 주문량을 변경
				t1.setText(짬뽕count + "개");
				
				//center라벨에 있는 이미지 변경
				ImageIcon center1 = new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\Java06\\짬뽕.jpg");
				center.setIcon(center1);
				
				//result라벨에 있는 결제금액 변경
				result.setText("결제금액 : " + total * 짬뽕count + "원");
				
				f.setTitle("짬뽕개수 : " + 짬뽕count + ", 짜장개수 : " + 짜장count + ", 우동개수 : " + 우동count);
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton.setBounds(25, 19, 126, 73);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("짜장");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				짜장count++;
				
				//현재 주문량을 변경
				t1.setText(짜장count + "개");
				
				//center라벨에 있는 이미지 변경
				ImageIcon center1 = new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\Java06\\짜장.jpg");
				center.setIcon(center1);
				
				//result라벨에 있는 결제금액 변경
				result.setText("결제금액 : " + total * 짜장count + "원");
				
				f.setTitle("짬뽕개수 : " + 짬뽕count + ", 짜장개수 : " + 짜장count + ", 우동개수 : " + 우동count);
			}
		});
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_1.setBounds(164, 19, 126, 73);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("우동");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				우동count++;
				
				//현재 주문량을 변경
				t1.setText(우동count + "개");
				
				//center라벨에 있는 이미지 변경
				ImageIcon center1 = new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\Java06\\우동.jpg");
				center.setIcon(center1);
				
				//result라벨에 있는 결제금액 변경
				result.setText("결제금액 : " + total * 우동count + "원");
				
				f.setTitle("짬뽕개수 : " + 짬뽕count + ", 짜장개수 : " + 짜장count + ", 우동개수 : " + 우동count);
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_2.setBounds(300, 19, 126, 73);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
		

	}
}
