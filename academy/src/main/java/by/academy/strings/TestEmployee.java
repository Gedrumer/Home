package by.academy.strings;

public class TestEmployee {

	public static void main(String[] args) {
		Employee[] employees = { new Employee("Ivan", 2500), new Employee("Peter", 3500), new Employee("Michael", 5500),
				new Employee("Zoue", 9500) };
		Report.generateReport(employees);

	}
}
