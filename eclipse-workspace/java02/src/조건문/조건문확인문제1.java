package 조건문;

import java.util.Scanner;

public class 조건문확인문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}

}
