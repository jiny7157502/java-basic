package 연산자;

import javax.swing.JOptionPane;

public class Exam05 {

	public static void main(String[] args) {
		double pi = 3.14;
		String radius = JOptionPane.showInputDialog("반지름의 길이");
		double radius2 = Double.parseDouble(radius);
		
		double area = pi * radius2 * radius2;
		
		System.out.println("원의 면적은 " + area);
	}

}
