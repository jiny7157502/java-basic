package 정적static;

import javax.swing.JOptionPane;

public class 스태틱메서드사용 {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("숫자입력");
		//public static String showInputDialog(String s) {
		// return "~~~";
		//}
	
		int n =Integer.parseInt(s);
		//public static int parseInt(String s3) {
		//	return ~~;
		//}
		System.exit(0);
	}
}
