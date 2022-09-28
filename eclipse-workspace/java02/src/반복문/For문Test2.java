package 반복문;

public class For문Test2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 1001; i += 3) {
			if (sum >= 100) {
				break;
			}
			if (i % 5 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
