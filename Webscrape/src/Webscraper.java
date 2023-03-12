import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Webscraper {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://quizlet.com/184625494/ise-222-ch2-flash-cards/").timeout(6000).get();
		
		Elements body = doc.select("span.TermText notranslate lang-en");
		System.out.println(body);
	}

}
