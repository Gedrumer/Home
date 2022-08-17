package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		Random rand=new Random();
		int max=0;
		ArrayList<Integer> marks=new ArrayList<>();
		for(int i=0;i<15;i++) {
			marks.add(i, rand.nextInt(1,10));
		}
		System.out.println("Marks:"+marks);
		Iterator<Integer> iterator=marks.iterator();
		while(iterator.hasNext()) {
			int mark=iterator.next();
			if(max<mark) {
				max=mark;
			}
		}
		System.out.println("Max:"+max);
	}

}
