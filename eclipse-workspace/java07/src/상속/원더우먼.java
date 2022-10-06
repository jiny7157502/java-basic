package 상속;

public class 원더우먼 extends 우먼{
	public void 강해진다() {
		System.out.println("힘이 강해진다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
}
