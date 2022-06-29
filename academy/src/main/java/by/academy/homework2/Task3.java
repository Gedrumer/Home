package by.academy.homework2;

public class Task3 {

	public static void main(String[] args) {
		String word1="WILD";
        String word2="WEST";
        String word3=((word1.substring(0,word1.length()/2))+(word2.substring(word2.length()/2,word2.length())));
        System.out.println("First word: "+word1);
        System.out.println("Second word: "+word2);
        System.out.println("Final word: "+word3);


	}

}
