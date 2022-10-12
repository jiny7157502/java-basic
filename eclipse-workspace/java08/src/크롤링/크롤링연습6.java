package 크롤링;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습6 {
	public String naver(String code) throws Exception {
		Element tag = null, tag2 = null, tag3 = null;
		// 1. 사이트에 연결해서, html문서를 다 가지고 오자.
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			
			//전일가
			Elements list = doc.select("td.first").select(".blind");
			tag = list.get(0);
			
			//현재가
			Elements list2 = doc.select("div.today").select(".blind");
			tag2 = list2.get(0);
			
			//시가
			Elements list3 = doc.select("td.first").select(".blind");
			tag3 = list3.get(1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "전일가: " + tag.text() + "\n" + "현재가: " + tag2.text() + "\n" + "시가: " + tag3.text();

	}
}