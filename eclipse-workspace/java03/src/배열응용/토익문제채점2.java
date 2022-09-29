package 배열응용;

import java.util.Random;

public class 토익문제채점2 {

	public static void main(String[] args) {
		// 1. 답안지, 대답안 공간만들어라.
		int[] answer = new int[990];
		int[] my_answer = new int[990];
		
		// 2. 랜덤하게 만들어주는 부품을 만들어라.
		Random r = new Random();
		
		// 3. 990번 반복해서 답안지, 대답안에 숫자를 넣어라
		// 1~4
		for (int i = 0; i < my_answer.length; i++) {
			answer[i] = r.nextInt(4) + 1;
			my_answer[i] = r.nextInt(4) + 1;
		}
		
		// 4. 같은 인덱스끼리 990번 비교
		// 비교하다가 숫자가 통일하면 점수를 1 늘려주세요.
		int jumsu = 0;
		for (int i = 0; i < my_answer.length; i++) {
			if (answer[i] == my_answer[i]) {
				jumsu++;
			}
		}
		
		// 5. 내 점수 프린트!
		System.out.println("점수는? " + jumsu);
	}

}
