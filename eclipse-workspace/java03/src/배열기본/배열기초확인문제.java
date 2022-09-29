package 배열기본;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		int[] array  = new int[5];
		System.out.println(array.length);
		array[0] = 100;
		System.out.println(array[0]);
		array[array.length-1] = 500;
		System.out.println(array[array.length-1]);
		array[2] = 200;
		System.out.println(array[2]);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + ", " + array[i]);
		}
	}

}
