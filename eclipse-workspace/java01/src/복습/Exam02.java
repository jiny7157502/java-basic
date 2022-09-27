package 복습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// 입력
		String height = JOptionPane.showInputDialog("키입력");
		
		// 처리
		double height2 = Double.parseDouble(height);
		double result = (height2 - 100) * 0.9;
		
		// 출력
		JOptionPane.showMessageDialog(null, "적정몸무게는 " + result);
	}

}
