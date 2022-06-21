package by.academy.homework1;

public class Cat {
	int age;
	String nickname;
	int money;
	char initials;
	boolean isHomeAnimal;

	public void grow() {
		this.age = age + 1;
	}

	public void sleep() {
		System.out.println("Cat sleep");
	}

	public void walk() {
		System.out.println("Cat walk");
	}

	public void eat() {
		System.out.println("Cat eat");
	}

	public Cat() {

	}

	public Cat(String nickname) {
		this.nickname = "Kitty";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;

	}

	public char getInitials() {
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;

	}

	public boolean getisHomeAnimal() {
		return isHomeAnimal;
	}

	public void setisHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;

	}
}
