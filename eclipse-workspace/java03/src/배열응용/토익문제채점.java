package 배열응용;

import java.util.Random;

public class 토익문제채점 {

	public static void main(String[] args) {
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
		
		Random r = new Random();
		
		//답안지에 1~4까지 랜덤하게 넣고, 프린트
		//내답안에 1~4까지 랜덤하게 넣고, 프린트
		
		for (int i = 0; i < 답안지.length; i++) {
			내답안[i] = r.nextInt(4)+1;
			답안지[i] = r.nextInt(4)+1;
		}
		
		System.out.println("번호:\t답안\t내답");
		System.out.println("---------------------");
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println(i + 1 + ":\t" + 답안지[i] + "\t" + 내답안[i]);
		}
		
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (답안지[i] == 내답안[i]) {
				jumsu++;
			}
		}
		System.out.println(jumsu);
	}

}
