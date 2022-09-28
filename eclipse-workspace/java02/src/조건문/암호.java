package 조건문;

import java.util.Scanner;

public class 암호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("암호를 대시오: ");
		String pw = sc.next();
		
		if (pw.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
	}

}
