package 복습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// 입력
		String com = JOptionPane.showInputDialog("통신사");
		String tel = JOptionPane.showInputDialog("전화번호");
		String name = JOptionPane.showInputDialog("이름");
		
		// 처리
		String total = name + "님은 " + com + "에 " + tel;
		
		// 출력
		JOptionPane.showMessageDialog(null, total + "로 가입되었습니다.");
	}

}
