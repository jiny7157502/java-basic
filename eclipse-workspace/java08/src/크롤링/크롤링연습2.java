package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
//			Elements list = doc.select(".code");
//			System.out.println(list.size());
//			Element tag = list.get(0);
//			System.out.println(tag.text());
//			
			
			Elements list = doc.select(".blind");
//			System.out.println(list.size());
//			for (int i = 0; i < list.size(); i++) {
//				Element tag = list.get(i);
//				System.out.println(i + " : "+ tag.text());
//			}
			//현재가
			Element tag = list.get(16);
			System.out.println(tag);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
