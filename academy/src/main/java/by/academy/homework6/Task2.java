package by.academy.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException {
		File dirs = new File("./io/");
		if (!dirs.exists()) {
			dirs.mkdirs();

		}
		File file1 = new File(dirs, "Task2.txt");
		if (!file1.exists()) {
			file1.createNewFile();
		}
		File file2 = new File(dirs, "result.txt");
		if (!file2.exists()) {
			file2.createNewFile();
		}
		try (BufferedReader fileReader = new BufferedReader(new FileReader(file1));
				FileWriter fileWriter = new FileWriter(file2)) {
			String a = null;
			while ((a = fileReader.readLine()) != null) {
				fileWriter.write(a.replaceAll("\\s+", ""));
			}
		}
		try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
