package by.academy.classworks.classwork5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		// ����� ��� ��������� "Java <X>" � ����������� ��.
		String q = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		Pattern pattern = Pattern.compile("Java\\s*\\d*");
		Matcher matcher = pattern.matcher(q);
		while (matcher.find()) {
			System.out.println(q.substring(matcher.start(), matcher.end()));
		}

	}

}
