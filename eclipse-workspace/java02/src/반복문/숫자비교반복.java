package 반복문;

import java.util.Scanner;

public class 숫자비교반복 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		
		while (true) {
			System.out.print("숫자입력1>>");
			int num1 = sc.nextInt();
			System.out.print("숫자입력2>>");
			int num2 = sc.nextInt();
			
			if (num1 > num2) {
				count1++;
				System.out.println("앞 숫자가 더 큽니다.");
			} else {
				count2++;
				System.out.println("뒷 숫자가 더 큽니다.");
			}
			
			System.out.print("종료할까요?(x) 계속할까요?(o)");
			String check = sc.next();
			char exit = check.charAt(0);
			if (exit == 'x') {
				System.out.println("앞 숫자가 더 큰 횟수는 " + count1);
				System.out.println("뒷 숫자가 더 큰 횟수는 " + count2);
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("계속합니다");
			}
		}

	}

}
