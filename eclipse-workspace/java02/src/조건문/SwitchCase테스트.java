package 조건문;

public class SwitchCase테스트 {

	public static void main(String[] args) {
		//정수(long X), 문자1(char), 문자열(String)
		//조건이 맞으면 내용을 처리하고 break!를 건다.
		//아래의 조건이 맞으면 출력
		String name = "자바";
		
		// 자체 break기능이 없어서, 프로그래머가 명시해줘야한다.
		switch (name) {
		case "자바":
			System.out.println("1103호로!");
			break;
		case "파이썬":
			System.out.println("1104호로!");
			break;
		case "리눅스":
			System.out.println("1102호로!");
			break;
		default: //else와 동일!, 생략가능
			System.out.println("카운터로 가세요.");
			break;
		}
	}

}
