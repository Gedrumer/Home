package by.academy.homework6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String text;
		StringBuilder build = new StringBuilder();
		File dirs = new File("./io/");
		if (!dirs.exists()) {
			dirs.mkdirs();

		}
		File file = new File(dirs, "Task1.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		System.out.println("Write 'stop' to finish.");
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
				ObjectOutputStream oos = new ObjectOutputStream(bos)) {

			while (true) {
				text = scan.nextLine();
				build.append(text);
				build.append("\n");
				if (text.compareTo("stop") == 0) {
					break;
				}
			}
			int start = build.indexOf("stop");
			build.replace(start, start + 4, "");
			oos.writeObject(build);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				ObjectInputStream ois = new ObjectInputStream(bis)) {
			StringBuilder str = (StringBuilder) ois.readObject();
			System.out.println(str);

		} catch (IOException | ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		scan.close();
	}

}
