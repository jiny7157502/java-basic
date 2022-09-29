package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기확인문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] last_travel = new String[3];
		String[] this_travel = new String[3];
		
		for (int i = 0; i < last_travel.length; i++) {
			System.out.print("작년에 가고 싶었던 곳 입력 ");
			last_travel[i] = sc.next();
		}
		
		for (int i = 0; i < this_travel.length; i++) {
			System.out.print("올해에 가고 싶었던 곳 입력 ");
			this_travel[i] = sc.next();
		}
		
		int check = 0;
		for (int i = 0; i < this_travel.length; i++) {
			if (last_travel[i].equals(this_travel[i])) {
				check++;
			}
		}
		System.out.println("작년과 올해 가고 싶은 곳이 동일한 곳은 " + check + "곳 입니다.");
		}
}
