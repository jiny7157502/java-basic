package 배열응용;

import java.util.Scanner;

public class 배열정리문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("언어를 입력하세요. ");
			name[i] = sc.next();
		}
		System.out.println(name[0] + "보다는 " + name[1]);
	}

}
