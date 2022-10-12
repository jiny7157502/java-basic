package 형변환;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 신호등 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(418, 492);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton redButton = new JButton("빨강신호");
		redButton.setFont(new Font("굴림", Font.BOLD, 19));
		redButton.setBackground(Color.RED);
		redButton.setBounds(12, 10, 113, 38);
		f.getContentPane().add(redButton);
		
		redButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("빨강.jpg");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton yellowButton = new JButton("노랑신호");
		yellowButton.setBackground(Color.YELLOW);
		yellowButton.setFont(new Font("굴림", Font.BOLD, 19));
		yellowButton.setBounds(137, 10, 128, 38);
		f.getContentPane().add(yellowButton);
		
		yellowButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("노랑.jpg");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		
		JButton blueButton = new JButton("파랑신호");
		blueButton.setBackground(SystemColor.textHighlight);
		blueButton.setFont(new Font("굴림", Font.BOLD, 19));
		blueButton.setBounds(277, 10, 113, 38);
		f.getContentPane().add(blueButton);
		
		blueButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("파랑.jpg");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		f.setVisible(true);
	}
}
