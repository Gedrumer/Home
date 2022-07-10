package by.academy.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task08 {

	public static void main(String[] args) {
//		Изменить регулярное выражение в примере для нахождения строк cab, ccab, cccab.
//		import java.util.regex.Matcher;
//		import java.util.regex.Pattern;
//
//		public class RegexDemo2 {
//		    public static void main(String[] args) {
//		        Pattern pattern = Pattern.compile("a*b");
//		        Matcher matcher = pattern.matcher("aaab");
//		        boolean b = matcher.matches();
//		        System.out.println(b);
//		    }
//		}
		Pattern pattern = Pattern.compile("[a-c]*b");
        Matcher matcher = pattern.matcher("cab");
        Matcher matcher1 = pattern.matcher("ccab");
        Matcher matcher2= pattern.matcher("cccab");
        boolean b = matcher.matches();
        boolean a = matcher1.matches();
        boolean c = matcher2.matches();
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
	}

}
