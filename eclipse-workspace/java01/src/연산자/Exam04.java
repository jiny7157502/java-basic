package 연산자;

import javax.swing.JOptionPane;

public class Exam04 {

	public static void main(String[] args) {
		String sport = JOptionPane.showInputDialog("체육 점수는");
		String math = JOptionPane.showInputDialog("수학 점수는");
		String english = JOptionPane.showInputDialog("영어 점수는");
		String korean = JOptionPane.showInputDialog("국어 점수는");
	
		int sport1 = Integer.parseInt(sport);
		int math1 = Integer.parseInt(math);
		int english1 = Integer.parseInt(english);
		int korean1 = Integer.parseInt(korean);
		
		float average = (sport1 + math1 + english1 + korean1) / 4;
		System.out.println("평균은 " + average);
	}
}
