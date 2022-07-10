package by.academy.strings;

public class Task03 {

	public static void main(String[] args) {
//		Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP». Например строка
//		"Object-oriented programming is a programming language model organized around objects rather than "actions" and
//		data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
//		должна быть преобразована в 
//		"Object-oriented programming is a programming language model organized around objects rather than "actions" and 
//		data rather than logic. OOP blabla. Object-oriented programming bla."
		StringBuilder build=new StringBuilder();
		build.append("Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
		System.out.println(build.lastIndexOf("blabla"));
		int index=build.indexOf("Object-oriented programming");
		System.out.println(build.indexOf("Object-oriented programming",index+1));
		System.out.println(build);
		build.replace(135, 162, "OOP");
		System.out.println(build);
	}

}
