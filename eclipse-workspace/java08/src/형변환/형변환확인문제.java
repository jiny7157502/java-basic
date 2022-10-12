package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {
	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		System.out.println("돈: " + me.get(0));
		System.out.println("키: " + me.get(1));
		System.out.println("아침여부: " + me.get(2));
		System.out.println("성별: " + me.get(3));
		
		int money = (int) me.get(0) + 1000;
		System.out.println(money);
		double height = (double) me.get(1) + 10;
		System.out.println(height);
		boolean food = (boolean) me.get(2);
		if (food == false) {
			System.out.println("배고파요.");
		} else {
			System.out.println("배불러요.");
		}
		char gender = (char)me.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1,3이예요");
		} else {
			System.out.println("주민번호는 2,4이예요");
		}
	}
}
