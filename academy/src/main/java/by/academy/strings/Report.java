package by.academy.strings;

import java.util.Arrays;

public class Report {

	public static void generateReport(Employee[] employees) {
		StringBuilder build = new StringBuilder();
		build.append("Salary of all employees: ");
		System.out.println(build);
		for (Employee employee : employees) {
			String[] arr = employee.getFullName().split(" ");
			System.out.println(Arrays.toString(arr) + "--------------------------" + employee.getSalary());
		}

	}
}
