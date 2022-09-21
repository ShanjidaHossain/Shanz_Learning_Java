import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		String[] names = {"Sansa ", "Kofil ", "Gulfam "};
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("name.txt"));
			writer.write("my name is sansa");
			writer.write("\nhere is a new Line");
			
			for (String name : names) {
				writer.write("\n" + name);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Reading from a File
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("name.txt"));
			String line ;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
