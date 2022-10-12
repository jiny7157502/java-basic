package 추상클래스인터페이스;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class 인터페이스그래픽 implements ActionListener {
	static JTextArea textArea;
	static JButton b1, b2;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(384, 305);
		f.getContentPane().setLayout(null);
		
		b1 = new JButton("b1");
		b1.setBounds(136, 5, 97, 23);
		f.getContentPane().add(b1);
		
		b2 = new JButton("b2");
		b2.setBounds(136, 38, 97, 23);
		f.getContentPane().add(b2);

		인터페이스그래픽 버튼처리 = new 인터페이스그래픽();
		b1.addActionListener(버튼처리);
		b2.addActionListener(버튼처리);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 67, 346, 179);
		f.getContentPane().add(textArea);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			textArea.append("b1버튼을 클릭함" + "\n");
		}
		if(e.getSource() == b2) {
			textArea.append("b2버튼을 클릭함" + "\n");
		}
	}
}
