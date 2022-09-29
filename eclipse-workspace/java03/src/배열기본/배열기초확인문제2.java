package 배열기본;

public class 배열기초확인문제2 {

	public static void main(String[] args) {
		String[] travel = new String[5];
		travel[0] = "부산";
		travel[1] = "경주";
		travel[2] = "이탈리아";
		travel[3] = "헝가리";
		travel[4] = "서울";
		for (int i = 0; i < travel.length; i++) {
			System.out.println(travel[i]);
		}
		
		char[] color = new char[5];
		color[0] = 'r';
		color[1] = 'g';
		color[2] = 'b';
		color[3] = 'y';
		color[4] = 'y';
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i]);
		}
		
		double[] height = new double[5];
		height[0] = 181.2;
		height[1] = 164.8;
		height[2] = 149.6;
		height[3] = 158.2;
		height[4] = 191;
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
		}
	}

}
