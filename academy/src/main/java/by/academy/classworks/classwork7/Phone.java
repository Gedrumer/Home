package by.academy.classworks.classwork7;

public class Phone {
//	�) ������� ����� sendMessage� ����������� ����������x �����(varargs). ������ ����� ��������� �� ���� ������ ���������, ������� ����� ���������� ���������. ����� ������� �� ������� ������ ���� ���������.
//	�) �������� ����� Phone � ������������ � ���������� JavaBean. 

	String number;
	String model;
	double weight;
	String name;

	public void recieveCall(String name) {
		name = name;
		System.out.println("Call" + name);
	}

	public void getNumber(String number) {
		number = number;
		System.out.println("Call" + number);
	}

	public Phone(String number, String model, double weight) {
		this.number = number;
		this.model = model;
		this.weight = weight;
	}

	public Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}

	public Phone() {

	}

	public void recieveCall(String name, String number) {
		name = name;
		number = number;
		System.out.println("Call " + name + " number: " + number);
	}
	public void sendMessage(String...args) {
		this.number=number;
		System.out.println(number);
	}

}
