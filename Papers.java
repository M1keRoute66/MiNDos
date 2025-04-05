import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Papers {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("storage.txt");
			writer.write("Hi\n");
			File storage = new File("storage.txt");
			Scanner scnr = new Scanner(storage);
			String message = scnr.nextline();
			System.out.print(message);
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}