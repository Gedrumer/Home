package by.academy.operators;

public class Task5 {

	public static void main(String[] args) {
		float s = 370_000;
		float sec;
		float m;
		float min;
		float h;
		float day;
		float week;
		float month;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		day=h/24;
		week=day/7;
		month=week/4;
		System.out.println(month+" month "+week+" week "+day+" days "+h + " hr " + min + " min " 
		+ sec + " sec");

	}

}
