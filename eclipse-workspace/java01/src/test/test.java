package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class test {
	private static JTextField food;
	private static JTextField age;
	private static JTextField korean;
	private static JTextField english;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		
		f.setSize(400, 537);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("나눔고딕", Font.PLAIN, 24));
		lblNewLabel.setBounds(21, 65, 159, 30);
		f.getContentPane().add(lblNewLabel);
		
		food = new JTextField();
		food.setBackground(Color.ORANGE);
		food.setFont(new Font("굴림", Font.PLAIN, 24));
		food.setBounds(181, 60, 169, 44);
		f.getContentPane().add(food);
		food.setColumns(10);
		
		JButton place = new JButton("어디로 갈까?");
		place.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String food2 = food.getText();
				
				if (food2.equals("커피")) {
					JOptionPane.showMessageDialog(f, "카페로 갑시다.");
				} else {
					JOptionPane.showMessageDialog(f, "에러");
				}
				
				food.setText("");
			}
		});
		place.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		place.setBounds(21, 125, 323, 35);
		f.getContentPane().add(place);
		
		JButton next_age = new JButton("나의 내년 나이는?");
		next_age.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String age2 = age.getText();
				
				int age3 = Integer.parseInt(age2);
				
				JOptionPane.showMessageDialog(f, "나의 내년 나이는 " + (age3 + 1));
			}
		});
		next_age.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		next_age.setBounds(21, 245, 323, 35);
		f.getContentPane().add(next_age);
		
		age = new JTextField();
		age.setBackground(Color.YELLOW);
		age.setFont(new Font("굴림", Font.PLAIN, 24));
		age.setColumns(10);
		age.setBounds(181, 180, 169, 44);
		f.getContentPane().add(age);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(21, 185, 159, 30);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton avg = new JButton("두 과목 점수의 평균은?");
		avg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String korean2 = korean.getText();
				String english2 = english.getText();
				
				double korean3 = Double.parseDouble(korean2);
				double english3 = Double.parseDouble(english2);
				
				double avg_result =  (korean3 + english3) / 2;
				
				JOptionPane.showMessageDialog(f, "두 과목의 평균은 "+ avg_result);
			}
		});
		avg.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		avg.setBounds(27, 442, 323, 35);
		f.getContentPane().add(avg);
		
		korean = new JTextField();
		korean.setBackground(Color.CYAN);
		korean.setFont(new Font("굴림", Font.PLAIN, 24));
		korean.setColumns(10);
		korean.setBounds(181, 304, 169, 44);
		f.getContentPane().add(korean);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(21, 309, 115, 30);
		f.getContentPane().add(lblNewLabel_2);
		
		english = new JTextField();
		english.setBackground(Color.CYAN);
		english.setFont(new Font("굴림", Font.PLAIN, 24));
		english.setColumns(10);
		english.setBounds(181, 374, 169, 44);
		f.getContentPane().add(english);
		
		JLabel lblNewLabel_2_1 = new JLabel("수학 점수");
		lblNewLabel_2_1.setFont(new Font("나눔고딕", Font.PLAIN, 24));
		lblNewLabel_2_1.setBounds(21, 379, 115, 30);
		f.getContentPane().add(lblNewLabel_2_1);
		f.setVisible(true);
	}

}
