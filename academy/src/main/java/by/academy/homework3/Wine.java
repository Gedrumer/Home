package by.academy.homework3;

public class Wine extends Product {
	private int age;
	private String color;
	private double cost;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public double discount() {
		// TODO Auto-generated method stub
		return 0;
	}



}