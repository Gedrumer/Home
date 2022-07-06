package by.academy.classworks.classwork1;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("test");

		cat2.eat();
		cat2.sleep();
		cat2.walk();

		cat1.grow();
		cat1.grow();
		cat1.grow();

		int catAge = cat1.getAge();

		
		System.out.println(catAge);

	}

}
