package 생성자;

public class Mask {
	String color;
	int price;
	int count;
	
	public Mask() {
		
	}
	
	public Mask(String color, int price, int count) {
		super();
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
}
