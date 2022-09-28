package 반복문;

import java.util.Scanner;

public class 인기투표프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int you = 0;
		int bts = 0;
		
		while (true) {
			System.out.print("입력(1)아이유, (2)유재석, (3)방탄, (4)종료>>");
			int num = sc.nextInt();
			
			if (num == 1) {
				iu++;
			} else if (num == 2) {
				you++;
			} else if (num == 3) {
				bts++;
			} else if (num == 4) {
				System.out.println("아이유의 투표 수는 " + iu);
				System.out.println("유재석의 투표 수는 " + you);
				System.out.println("방탄의 투표 수는 " + bts);
				break;
			}
		}
	}

}
