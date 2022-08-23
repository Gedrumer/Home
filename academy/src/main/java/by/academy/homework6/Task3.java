package by.academy.homework6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) throws IOException {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Samuel", "Adamson", 20));
		users.add(new User("Jack", "Aldridge", 21));
		users.add(new User("Joseph", "Evans", 22));
		users.add(new User("Harry", "Johnson", 23));
		users.add(new User("Alfie", "Davies", 24));
		users.add(new User("Jacob", "Wilson", 25));
		users.add(new User("Thomas", "Parson", 26));
		users.add(new User("Charlie", "Ellington", 27));
		users.add(new User("Oscar", "Flatcher", 28));
		users.add(new User("James", "Gilbert", 29));

		File dirs = new File("./io/users");
		if (!dirs.exists()) {
			dirs.mkdirs();

		}
		for (int i = 0; i < users.size(); i++) {
			File file = new File(dirs, users.get(i).getName() + "_" + users.get(i).getSurName() + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}

		}
		for (File file : dirs.listFiles()) {
			try (BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("./io/users/" + file.getName()));
					ObjectOutputStream oos = new ObjectOutputStream(bos)) {
				for (int i = 0; i < users.size(); i++) {
					if (file.getName().contains(users.get(i).getName() + "_" + users.get(i).getSurName())) {
						oos.writeObject(users.get(i));
					}
				}

			} catch (IOException ex) {
				System.err.println(ex.getMessage());
			}
		}
		for (File file : dirs.listFiles()) {
			try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./io/users/" + file.getName()));
					ObjectInputStream ois = new ObjectInputStream(bis)) {
				User u = (User) ois.readObject();
				System.out.println(u);

			} catch (IOException | ClassNotFoundException ex) {
				System.err.println(ex.getMessage());
				ex.printStackTrace();
			}
		}
	}

}
