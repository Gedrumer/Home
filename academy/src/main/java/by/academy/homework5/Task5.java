package by.academy.homework5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {
		String text = "Equally, the beginning of the daily work on the "
				+ "formation of the position creates a session of inclusion in the production plan of the meeting of extraordinary events, "
				+ "taking into account the meeting of the development meeting. It is clear that our position requires the definition and refinement"
				+ " of the capture system. Some shareholders of large companies, overcoming the current difficult economic situation,"
				+ " are associatively distributed by industry.";
		text = text.toLowerCase();
		Map<Character,Integer> result=new HashMap<>();
		for(int i=0;i<text.length();i++) {
			Character uniqueChars=text.charAt(i);
			Integer countOfUniqueChars=result.get(uniqueChars);
			if(countOfUniqueChars==null) {
				countOfUniqueChars=1;
				result.put(uniqueChars, countOfUniqueChars);
			}
			else{
				countOfUniqueChars+=1;
				result.put(uniqueChars, countOfUniqueChars);
			}			
		}
		System.out.println(result.toString());
	}

}
