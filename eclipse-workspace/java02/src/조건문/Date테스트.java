package 조건문;

import java.util.Date;

public class Date테스트 {

	public static void main(String[] args) {
		Date date = new Date();
		int time = date.getHours();
		
		if (time < 11) {
			System.out.println("굿모닝");
		} else if (time > 11 && time < 15){
			System.out.println("굿애프터눈");
		} else if (time > 15 && time < 19) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
	}

}