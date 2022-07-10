package by.academy.strings;

import java.util.Arrays;

public class Employee {

//	Создать массив содержащий несколько объектов этого типа. Создать класс Report, 
//	который будет содержать статический метод generateReport, 
//	в котором выводится информация о зарплате всех сотрудников. 
//	Используйте форматировании строк. 
	String fullname;
	double salary;
	public Employee(String fullname,double salary) {
		this.fullname=fullname;
		this.salary=salary;
	}
	public String getFullName() {
		return fullname;
	}
	public double getSalary () {
		return salary;
	}
	public void setFullName(String fullname) {
		this.fullname=fullname;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
}
