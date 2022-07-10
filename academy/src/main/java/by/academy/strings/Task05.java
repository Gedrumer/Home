package by.academy.strings;

public class Task05 {

	public void students(String a1,String a2,String a3) {
		StringBuilder build=new StringBuilder();
		build.append("STUDENT ");
		build.append(a1);
		build.append(" get ");
		build.append(a2);
		build.append(" on ");
		build.append(a3);
		System.out.println(build);
	}
	public static void main(String[] args) {
//		Создать строку, используя форматирование: 
//			Студент [Фамилия] получил [оценка] по [предмету]. 
//			Форматирование и вывод строки на консоль написать в отдельном методе, 
//			который принимает фамилию, оценку и название предмета в качестве параметров. 
//			Выделить под фамилию 15 символов, под оценку 3 символа, предмет – 10.
		Task05 tasl=new Task05();
		tasl.students("Ivan", "FOUR", "MATH");

	}

}
