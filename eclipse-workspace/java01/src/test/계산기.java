package test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class 계산기 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(365, 365);
		f.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.YELLOW);
		textField.setBounds(136, 85, 176, 57);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(25, 85, 84, 57);
		f.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(25, 248, 126, 48);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(186, 248, 126, 48);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(25, 163, 84, 57);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.YELLOW);
		textField_1.setColumns(10);
		textField_1.setBounds(136, 163, 176, 57);
		f.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\java01\\cal.jpg"));
		lblNewLabel_2.setBounds(67, 6, 209, 69);
		f.getContentPane().add(lblNewLabel_2);
		f.setVisible(true);
	}

}
