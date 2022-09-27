package 연산자;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		String yes_weight = JOptionPane.showInputDialog("어제의 몸무게");
		String tod_weight = JOptionPane.showInputDialog("오늘의 몸무게");
		int weight = Integer.parseInt(yes_weight) - Integer.parseInt(tod_weight);
		
		if (weight > 2) {
			System.out.println("다이어트 성공");
		} else {
			System.out.println("다이어트 실패");
		}
	}

}
