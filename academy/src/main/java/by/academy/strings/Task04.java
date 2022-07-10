package by.academy.strings;

public class Task04 {

	public static void main(String[] args) {
//		Даны строки разной длины (длина - четное число), 
//		необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
		StringBuilder build=new StringBuilder();
		StringBuilder build1=new StringBuilder();
		StringBuilder build2=new StringBuilder();
		build.append("string");
		build1.append("code");
		build2.append("Practice");
		System.out.println(build.substring(2, 4));
		System.out.println(build1.substring(1, 3));
		System.out.println(build2.substring(3, 5));

	}

}
