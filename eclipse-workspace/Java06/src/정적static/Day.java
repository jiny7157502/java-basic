package 정적static;

public class Day {
	String doing;
	int time;
	String location;
	static int count; //어디서든 쓰고 싶을 때
	static int all_time;
	
	public Day(String doing, int time, String location) {
		count++;
		all_time += time;
		this.doing = doing;
		this.time = time;      
		this.location = location;
	}

	//일반 메서드는 객체생성 후, "주소로 접근"해서 호출해야함
	//객체생성과 상관없이 기능을 정의하고 싶으면, static 이용
	// static 메서드 안에 들어가는 변수는 static 변수만 가능
	public static double getAvg() {
		return all_time / (double) count;
	}
	
	@Override
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
}
