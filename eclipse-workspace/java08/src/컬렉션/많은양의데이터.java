package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;

public class 많은양의데이터 {

	public static void main(String[] args) {
		// 데이터타입도 다르고, 크기도 유동적
		// 순서가 중요
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add("홍길동");
		list.add("홍길동");
		list.add(100);
		list.add(11.1);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	
		HashSet set = new HashSet();
		set.add(list.get(0));
		set.add(list.get(1));
		set.add(list.get(2));
		set.add(list.get(3));
		set.add(list.get(4));
		System.out.println(set);
	}

}
