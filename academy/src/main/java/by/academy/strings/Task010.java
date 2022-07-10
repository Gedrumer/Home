package by.academy.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task010 {

	public static void main(String[] args) {
//		Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”  
//		Найти все подстроки "Java <X>" и распечатать их.
		String q = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		Pattern pattern = Pattern.compile("Java\\s*\\d*");
		Matcher matcher = pattern.matcher(q);
		while (matcher.find()) {
			System.out.println(q.substring(matcher.start(), matcher.end()));
		}
	}

}
