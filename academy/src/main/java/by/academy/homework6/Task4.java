package by.academy.homework6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) throws IOException {
		Random rand = new Random();
		StringBuilder build = new StringBuilder();
		File dirs = new File("./io/Task4");
		if (!dirs.exists()) {
			dirs.mkdirs();

		}
		File file1 = new File(dirs, "result.txt");
		if (!file1.exists()) {
			file1.createNewFile();
		}
		for (int i = 0; i < 100; i++) {
			File file = new File(dirs, (i + 1) + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}

		}
		for (int i = 0; i < 100; i++) {
			try (BufferedReader fileReader = new BufferedReader(new FileReader("./io/Task4/text.txt"));
					FileWriter fileWriter = new FileWriter("./io/Task4/" + (i + 1) + ".txt")) {
				String a = null;
				while ((a = fileReader.readLine()) != null) {
					int end = rand.nextInt(0, 574);
					fileWriter.write(a.substring(0, end));
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			try (BufferedReader fileReader = new BufferedReader(new FileReader("./io/Task4/" + (i + 1) + ".txt"));
					FileWriter fileWriter = new FileWriter("./io/Task4/result.txt")) {
				
				File file = new File("./io/Task4/" + (i + 1) + ".txt");
				build.append("File: "+file.getName()+". Size:"+file.length());
				build.append("\n");
				fileWriter.append(build.toString());
			}
		}

		try (BufferedReader br = new BufferedReader(new FileReader("./io/Task4/result.txt"))) {
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
