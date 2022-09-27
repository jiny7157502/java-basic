package 연산자;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		String set_pw = "p";
		String inp_pw = JOptionPane.showInputDialog("암호를 입력");
		
		String yes_weight = JOptionPane.showInputDialog("어제의 몸무게");
		String tod_weight = JOptionPane.showInputDialog("오늘의 몸무게");
		int weight = Integer.parseInt(yes_weight) - Integer.parseInt(tod_weight);

		if (set_pw == inp_pw && weight > 2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");
		}
	}

}
