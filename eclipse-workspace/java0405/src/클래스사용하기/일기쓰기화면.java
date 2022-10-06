package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class 일기쓰기화면 {
	//멤버변수
	private static JTextField t1;
	private static JTextField t2;
	private static JTextArea t3;
	
	//멤버메서드
	public void open() {
//	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		
		f.setSize(499,538);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("오늘날짜");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(22, 31, 144, 58);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(210, 31, 249, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(210, 119, 249, 53);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘제목");
		lblNewLabel_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(22, 119, 144, 53);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				try {
					FileWriter file = new FileWriter(s1 + ".txt");
					
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					
					file.close();
				} catch (Exception e) {
					System.out.println("파일에 저장 중 에러발생함.");
				}
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 30));
		btnNewButton.setBounds(41, 405, 398, 65);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("오늘내용");
		lblNewLabel_1_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(22, 205, 144, 58);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t3 = new JTextArea();
		t3.setBounds(210, 205, 248, 175);
		f.getContentPane().add(t3);
		f.setVisible(true);
	}
}
