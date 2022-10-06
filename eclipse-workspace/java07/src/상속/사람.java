package 상속;

public class 사람 extends Object {
	String gender;
	String name;
	
	public void 잠자다() {
		System.out.println("잠자다.");
	}
	
	public void 먹다() {
		System.out.println("먹다.");
	}

	@Override
	public String toString() {
		return "사람 [gender=" + gender + ", name=" + name + "]";
	}
	
	
}
