package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class 컬렉션문제 {

	public static void main(String[] args) {
		// 1번 문제
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("DB관리자");
		System.out.println(team);
		
		// 2번 문제
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println(milk);
		
		// 3번 문제
		ArrayList ski_list = new ArrayList();
		ski_list.add("박스키");
		ski_list.add("송스키");
		ski_list.add("김스키");
		ski_list.add("정스키");
		ski_list.remove(1);
		System.out.println(ski_list);
		
		// 4번 문제
		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "친구");
		phone.put(4, "동생");
		System.out.println(phone.get(2));
		
	}

}
