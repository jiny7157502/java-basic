package 클래스사용하기;

import 클래스만들기.강아지;
import 클래스만들기.전화기;

public class 내방프로젝트 {

	public static void main(String[] args) {
		//전화기 한대 넣어보세요.
		전화기 p1 = new 전화기();
		
		System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.통화하다();
		p1.사진을찍다();
		
		//전화기 1대 추가
		전화기 p2 = new 전화기();
		p2.size = 14;
		p2.speaker = "마샬";
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		p2.통화하다();
		p2.사진을찍다();
		
		강아지 d1 = new 강아지();
		d1.age = 10;
		d1.color = "brown";
		d1.field = "진돗개";
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.field);
		d1.꼬리를흔들다();
		d1.사람을잘따른다();
	}

}
