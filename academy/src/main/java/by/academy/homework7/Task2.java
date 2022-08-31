package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Task2 {

	public static void main(String[] args) {
		User user = new User();
		Person person = new Person();

		Class<User> userClass = User.class;
		Class<Person> personClass = Person.class;
		try {
			Method getLoginMethod = userClass.getMethod("getLogin");
			System.out.println(getLoginMethod);
			Method getPasswordMethod = userClass.getMethod("getPassword");
			System.out.println(getPasswordMethod);
			Method getEmailMethod = userClass.getMethod("getEmail");
			System.out.println(getEmailMethod);
			
			for (Method m: userClass.getMethods()) {
				System.out.println(m);
				}
						
			Field loginField = userClass.getField("login");
			System.out.println(loginField);
			
			for (Field f: userClass.getFields()) {
				System.out.println(f);
				}
						
			Method getPrintUserInfoMethod=userClass.getDeclaredMethod("printUserInfo");
			System.out.println(getPrintUserInfoMethod);
			
			for (Method m: userClass.getDeclaredMethods()) {
				System.out.println(m);
				}
			
			Field emailField = userClass.getDeclaredField("email");
			System.out.println(emailField);
			Field passwordField = userClass.getDeclaredField("password");
			System.out.println(passwordField);
						
			for (Field f: userClass.getDeclaredFields()) {
				System.out.println(f);
				}
			for (Field f: personClass.getDeclaredFields()) {
				System.out.println(f);
				}
			
			Field lastNameField = userClass.getField("lastName");
			System.out.println(lastNameField);
				
		} catch (NoSuchMethodException | NoSuchFieldException | SecurityException e) {
			System.out.println("Method/field not found" + e);
		}
		try {
			Field loginField = userClass.getDeclaredField("login");
			loginField.setAccessible(true);
			loginField.set(user, "Gedrumer");		
			System.out.println("Login field:" + loginField.get(user));
			
			Field passwordField = userClass.getDeclaredField("password");
			passwordField.setAccessible(true);
			passwordField.set(user, "987654321");		
			System.out.println("Password field: " + passwordField.get(user));
			
			Field emailField = userClass.getDeclaredField("email");
			emailField.set(user, "vano3.9@gmail.com");		
			System.out.println("Email field: " + emailField.get(user));
								
			Field firstNameField = personClass.getDeclaredField("firstName");
			firstNameField.set(person, "Ivan");		
			System.out.println("FirstName field: " + firstNameField.get(person));
			
			Field lastNameField = personClass.getDeclaredField("lastName");
			lastNameField.setAccessible(true);
			lastNameField.set(person, "Shcharbina");		
			System.out.println("LastName field: " + lastNameField.get(person));
			
			Field ageField = personClass.getDeclaredField("age");
			ageField.set(person, 26);		
			System.out.println("Age field: " + ageField.get(person));
			
			Field dateOfBirthField = personClass.getDeclaredField("dateOfBirth");
			dateOfBirthField.set(person, "08/06/1996");		
			System.out.println("DateOfBirth field: " + dateOfBirthField.get(person));
			
			System.out.println("Calling toString via invoke:");
			Method toStringMethod=userClass.getMethod("toString");
			System.out.println(toStringMethod.invoke(user));
								
		} catch (NoSuchFieldException | NoSuchMethodException| SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException  e) {
			e.printStackTrace();
		}

	}

}
