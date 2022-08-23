package by.academy.homework6;

import java.io.Serializable;

//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст). 
//В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
//Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге. Назовите файл Имя_Фамилия.txt.
//Сериализуйте информацию о пользователе и положите в файл пользователя. Не забываем закрывать потоки.
//В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String surName;
	private int age;

	public User() {
		super();
	}

	public User(String name, String surName, int age) {
		this.name = name;
		this.surName = surName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surName=" + surName + ", age=" + age + "]";
	}
}
