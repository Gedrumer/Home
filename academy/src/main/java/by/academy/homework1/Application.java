package by.academy.homework1;

public class Application {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Kitty");

		cat2.eat();
		cat2.sleep();
		cat2.walk();

		cat1.grow();
		cat1.grow();
		cat1.grow();

		int catAge = cat1.getAge();
		boolean catHome=cat1.getisHomeAnimal();
		char catName=cat2.getInitials();
		System.out.println(catAge);
		System.out.println(catName);
		System.out.println(catHome);
	}

}
