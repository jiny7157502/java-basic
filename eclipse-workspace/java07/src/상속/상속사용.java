package 상속;

public class 상속사용 {
	public static void main(String[] args) {
		사람 p = new 사람();
		
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		System.out.println(m);
		
		수퍼맨 sMan = new 수퍼맨();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		System.out.println(sMan);
		sMan.날아다니다();
		sMan.달리다();
		sMan.먹다();
		sMan.잠자다();
		
		우먼 w = new 우먼();
		w.gender = "여자";
		w.name = "캐서린";
		w.size = 50;
		System.out.println(w);
		
		원더우먼 wWoman = new 원더우먼();
		wWoman.gender = "여자";
		wWoman.name = "마틸다";
		wWoman.size = 60;
		System.out.println(wWoman);
		wWoman.걷다();
		wWoman.강해진다();
		wWoman.먹다();
		wWoman.잠자다();
	}
}
