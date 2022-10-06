package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class 로그인화면 {
	//멤버변수
	private static JTextField t1;
	private static JTextField t2;

	//멤버메서드
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		
		f.setSize(499,538);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\java04\\diary.png"));
		lblNewLabel.setBounds(138, 20, 225, 239);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(70, 267, 115, 58);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(213, 267, 218, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(213, 335, 218, 53);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(70, 335, 144, 58);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				//id = "root", pw = "1234"이면, 일기쓰는 화면을 띄우고
				//아니면, JOptionPane으로 "입력값이 달라서 로그인 실패입니다".
				if (s1.equals("root") && s2.equals("1234")) {
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "입력값이 달라서 로그인 실패입니다.");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\java04\\login.jpg"));
		btnNewButton.setBounds(41, 417, 195, 53);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\java04\\reset.jpg"));
		btnNewButton_1.setBounds(257, 417, 195, 53);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
