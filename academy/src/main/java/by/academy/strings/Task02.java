package by.academy.strings;

public class Task02 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		StringBuilder builder1 = new StringBuilder();
		StringBuilder builder2 = new StringBuilder();
		builder.append("3+56=59");
		builder1.append("3-56=-53");
		builder2.append("3*56=168");
		System.out.println(builder);
		System.out.println(builder1);
		System.out.println(builder2);
		builder.deleteCharAt(4);//удаляет символ
		builder.insert(4,"equals");// вставить на место 
		System.out.println(builder);
		builder1.replace(4, 5,"equals");//заменить
		System.out.println(builder1);
	}

}
