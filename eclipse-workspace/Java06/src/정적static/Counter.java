package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
	static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.getContentPane().setLayout(null);
		
		JLabel number = new JLabel("0");
		number.setFont(new Font("굴림", Font.BOLD, 99));
		number.setForeground(Color.RED);
		number.setHorizontalAlignment(SwingConstants.CENTER);
		number.setBounds(12, 64, 259, 187);
		f.getContentPane().add(number);
		
		JButton b1 = new JButton("1 더하기");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				number.setText(count + "");
			}
		});
		b1.setForeground(SystemColor.desktop);
		b1.setBackground(SystemColor.info);
		b1.setFont(new Font("굴림", Font.BOLD, 10));
		b1.setBounds(12, 10, 75, 45);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("초기화");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count = 0;
				number.setText(count + "");
			}
		});
		b2.setBackground(SystemColor.textHighlight);
		b2.setForeground(SystemColor.desktop);
		b2.setFont(new Font("굴림", Font.BOLD, 10));
		b2.setBounds(99, 10, 85, 45);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("1 빼기");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count--;
				number.setText(count + "");
			}
		});
		b3.setBackground(SystemColor.info);
		b3.setForeground(SystemColor.desktop);
		b3.setFont(new Font("굴림", Font.BOLD, 10));
		b3.setBounds(196, 10, 75, 45);
		f.getContentPane().add(b3);
		f.setVisible(true);
	}

}
