package test;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Color;

public class 나의첫계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GRAY);
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(226, 51, 194, 46);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 36));
		lblNewLabel.setBounds(72, 51, 104, 46);
		f.getContentPane().add(lblNewLabel);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(226, 129, 194, 46);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 36));
		lblNewLabel_1.setBounds(72, 122, 104, 46);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton plus = new JButton("+");
		plus.setForeground(new Color(0, 0, 0));
		plus.setBackground(Color.GREEN);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				//1. 두수를 가지고 오세요.(String)
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				f.setTitle("더한 결과는 " + (n11 + n22));
				// JOptionPane.showMessageDialog(f, n11 + n22);
				
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
				t1.setForeground(Color.red);
			}
		});
		
		plus.setFont(new Font("굴림", Font.PLAIN, 26));
		plus.setBounds(24, 191, 83, 46);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.setBackground(Color.YELLOW);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
				
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, n11 - n22);
				
				t1.setText("");
				t2.setText("");
			}
		});
		minus.setFont(new Font("굴림", Font.PLAIN, 26));
		minus.setBounds(145, 191, 83, 46);
		f.getContentPane().add(minus);
		
		JButton multi = new JButton("*");
		multi.setBackground(Color.CYAN);
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "곱하기 버튼을 누르셨군요.");
				
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, n11 * n22);
				
				t1.setText("");
				t2.setText("");
			}
		});
		multi.setFont(new Font("굴림", Font.PLAIN, 26));
		multi.setBounds(262, 191, 83, 46);
		f.getContentPane().add(multi);
		
		JButton div = new JButton("/");
		div.setBackground(Color.RED);
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나누기 버튼을 누르셨군요.");
				
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, n11 / n22);
				
				t1.setText("");
				t2.setText("");
			}
		});
		div.setFont(new Font("굴림", Font.PLAIN, 26));
		div.setBounds(378, 191, 83, 46);
		f.getContentPane().add(div);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\java01\\cal.jpg"));
		lblNewLabel_2.setBounds(24, 247, 225, 197);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\jiny7\\eclipse-workspace\\java01\\cal.jpg"));
		lblNewLabel_2_1.setBounds(236, 247, 225, 197);
		f.getContentPane().add(lblNewLabel_2_1);
		f.setVisible(true);
	}

}
