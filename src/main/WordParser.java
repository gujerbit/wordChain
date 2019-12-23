package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WordParser {
	private String[] name;

	public WordParser(String[] name) {
		this.name = name;

		String url = "https://namu.wiki/w/끄투/한국어/긴%20단어?from=%EB%81%84%ED%88%AC%2F%EA%B8%B4%20%EB%8B%A8%EC%96%B4";

		try {
			Document doc = Jsoup.connect(url).get();

			Elements span = doc.select(".w .wiki-heading-content .wiki-table-wrap .wiki-table > tbody > tr > td .wiki-paragraph");

			name = span.select("strong").text().toString().split(" ");

			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파서 실행 중 오류 발생");
		}
	}
}
