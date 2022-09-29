package 배열응용;

import java.util.Random;

public class 임의숫자1000개넣기 {

	public static void main(String[] args) {
		//1. 1000개 데이터를 넣을 공간을 만들어라.
		int[] lotto = new int[6];
		//2. 랜덤한 값 만들어주는 부품을 만들어라.
		Random r = new Random();
		//3. 반복문으로 랜덤한 값 1000개 만들어서 저장공간에 넣어라.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		//4. 1000개 프린트 해보자.
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		
		
		
	}

}
