package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주식정보크롤링 {
	private static JTextField t1;
	static JTextArea textArea;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 주식 크롤링");
		f.setSize(400, 550);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE:");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(88, 196, 218, 58);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(Color.GREEN);
		t1.setBounds(12, 264, 360, 48);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textArea.setBounds(12, 373, 360, 128);
		f.getContentPane().add(textArea);
		
		JButton samsung_btn = new JButton("삼성전자");
		samsung_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				크롤링연습6 crawling = new 크롤링연습6();
				try {
					String result = crawling.naver("005930");
					textArea.setText(result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		samsung_btn.setBackground(Color.ORANGE);
		samsung_btn.setFont(new Font("굴림", Font.BOLD, 36));
		samsung_btn.setBounds(29, 10, 328, 48);
		f.getContentPane().add(samsung_btn);
		
		JButton kakao_btn = new JButton("카카오");
		kakao_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				크롤링연습6 crawling = new 크롤링연습6();
				try {
					String result = crawling.naver("035720");
					textArea.setText(result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		kakao_btn.setBackground(Color.ORANGE);
		kakao_btn.setFont(new Font("굴림", Font.BOLD, 36));
		kakao_btn.setBounds(29, 80, 328, 48);
		f.getContentPane().add(kakao_btn);
		
		JButton naver_btn = new JButton("네이버");
		naver_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				크롤링연습6 crawling = new 크롤링연습6();
				try {
					String result = crawling.naver("035420");
					textArea.setText(result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		naver_btn.setBackground(Color.ORANGE);
		naver_btn.setFont(new Font("굴림", Font.BOLD, 36));
		naver_btn.setBounds(29, 151, 328, 48);
		f.getContentPane().add(naver_btn);
		
		JButton btnNewButton_3 = new JButton("크롤링 시작");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String code = t1.getText();
				크롤링연습6 crawling = new 크롤링연습6();
				try {
					String result = crawling.naver(code);
					textArea.setText(result);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 26));
		btnNewButton_3.setBounds(78, 322, 239, 39);
		f.getContentPane().add(btnNewButton_3);
		f.setVisible(true);
	}
}
