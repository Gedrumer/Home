package by.academy.homework5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task1 {
	public static HashSet<String> withoutDuplicate(List<String> list){
		return new HashSet<>(list);
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("D");
		System.out.println(withoutDuplicate(list));

	}

}
