import org.jsoup.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JSoupTester {

public static void main(String[] args) throws IOException {

  Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
  System.out.println(doc.title());
  Elements newsHeadlines = doc.select("#mp-itn b a");
  for (Element headline : newsHeadlines) {
    System.out.printf("%s\n\t%s", headline.attr("title"), headline.absUrl("href"));
    }
  }
}


//use javac -cp "jsoup-1.14.1.jar:." JSoupTester.java and java -cp "jsoup-1.14.1.jar:." JSoupTester.java
/*  //output on 7/27/21
Wikipedia, the free encyclopedia
2020 Summer Olympics opening ceremony
	https://en.wikipedia.org/wiki/2020_Summer_Olympics_opening_ceremonyBids for the 2032 Summer Olympics
	https://en.wikipedia.org/wiki/Bids_for_the_2032_Summer_OlympicsTerunofuji Haruo
	https://en.wikipedia.org/wiki/Terunofuji_HaruoLiverpool Maritime Mercantile City
	https://en.wikipedia.org/wiki/Liverpool_Maritime_Mercantile_City2021 Henan floods
	https://en.wikipedia.org/wiki/2021_Henan_floodsPortal:Current events
	https://en.wikipedia.org/wiki/Portal:Current_eventsDeaths in 2021
	https://en.wikipedia.org/wiki/Deaths_in_2021Wikipedia:In the news/Candidates
	https://en.wikipedia.org/wiki/Wikipedia:In_the_news/Candidates
  */
