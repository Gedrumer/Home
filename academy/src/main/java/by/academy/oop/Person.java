package by.academy.oop;

public class Person {
//	2.	Создать класс Person, который содержит: 
//		a) поля fullName, age. 
//		б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит". 
//		в) Добавьте два конструктора  - Person() и Person(fullName, age).
//		Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
	String fullname;
	int age;
	public Person() {
		
	}
	public void setFullName(String fullname) {
		this.fullname=fullname;
	}
	public String getFullName() {
		return fullname;
	}
	public Person(String fullname,int age) {
		this.fullname=fullname;
		this.age=age;
	}
	public void talk() {
		System.out.println(this.getFullName()+" talk.");
	}
	public void move() {
		System.out.println(this.getFullName()+" move.");
	}
}
