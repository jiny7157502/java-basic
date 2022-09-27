package 연산자;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		String set_pw = "p";
		String inp_pw = JOptionPane.showInputDialog("암호를 입력");
		if (set_pw.equals(inp_pw)) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");
		}
	}
}
