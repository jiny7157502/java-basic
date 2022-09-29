package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("정수를 입력하세요. ");
			num[i] = sc.nextInt();
		}
		System.out.println(num[0] + num[2]);
	}

}
