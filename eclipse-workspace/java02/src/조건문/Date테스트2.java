package 조건문;

import java.util.Date;

public class Date테스트2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		
		switch (month) {
		case 2:
			System.out.println(28);
			break;
		case 4: case 6: case 7: case 8:
			System.out.println(30);
			break;
		default:
			System.out.println(31);
			break;
		}	
	}

}