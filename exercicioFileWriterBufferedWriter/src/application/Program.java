package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		//Colocando true na frente do path podemos apenas acrescentar informações ao arquivo, sem excluir o que tinha nele.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
