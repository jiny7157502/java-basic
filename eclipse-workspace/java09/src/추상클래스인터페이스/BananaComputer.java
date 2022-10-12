package 추상클래스인터페이스;

public class BananaComputer implements 컴퓨터{

	@Override
	public void 크기를넓게만들다() {
		// TODO Auto-generated method stub
		System.out.println("13인치의 크기로 작게 만들다.");
	}

	@Override
	public void 무게를가볍게만들다() {
		// TODO Auto-generated method stub
		System.out.println("1kg로의 무게로 만든다.");
		
	}

	@Override
	public void 용량을많게만들다() {
		// TODO Auto-generated method stub
		System.out.println("512GB로 용량을 설정한다.");
	}

}
