package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 컴퓨터1 = new 컴퓨터(100000, "철수회사", 17);
		컴퓨터 컴퓨터2 = new 컴퓨터(120000, "영희회사", 21);		
		
		System.out.println(컴퓨터1.toString());
		System.out.println(컴퓨터2.toString());
	}

}
