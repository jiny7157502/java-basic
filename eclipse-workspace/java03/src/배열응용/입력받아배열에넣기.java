package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자입력>> ");
			num[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		
		System.out.println(sum);
		System.out.println(sum / 5.0);
//		System.out.println("저장된 데이터는 " + data);
	}
}
