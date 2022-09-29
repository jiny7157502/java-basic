package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class 영화앨범만들기 {
	// 전체영역에서 특정한 변수를 사용하려면 클래스 아래에 선언
	static int start = 2; //전역변수

	public static void main(String[] args) {
		//영화제목
		String[] title = {"인생은 아름다워", "정직한 후보2", "육사오", "늑대사냥", "아바타"};
		//포스터파일(파일이름)
		String[] img = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg"};
		//평점
		double[] jumsu = {8.87, 7.85, 8.04, 5.47, 9.57};

		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JLabel top = new JLabel(" ");
		top.setBackground(Color.YELLOW);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel under = new JLabel(" ");
		under.setBackground(Color.YELLOW);
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(SwingConstants.CENTER);

		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton(">>");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//<<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면, 여기서 처리
				//제목이 표시된 라벨에 제목을 변경해야함.
				if (start < 4) {
				start = start + 1;
				top.setText(title[start]);
				center.setIcon(new ImageIcon(img[start]));
				under.setText(jumsu[start] + "점");
				} else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다.");
				}
				
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.EAST);
		
		JButton btnNewButton_1 = new JButton("<<");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//<<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면, 여기서 처리
				//제목이 표시된 라벨에 제목을 변경해야함.
				if (start > 0) {
					start = start - 1;
					top.setText(title[start]);
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
					under.setText(jumsu[start] + "점");
				} else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝입니다.");
				}

			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		f.setVisible(true);
	}

}
