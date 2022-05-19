package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//nos traz somente o nome da pasta
		System.out.println("getName: " + path.getName());
		//nos traz a localidade da pasta  (caminho parcial)
		System.out.println("getParent: " + path.getParent());
		//nos traz todo o caminho
		System.out.println("getPath: " + path.getPath());
		
		sc.close();

	}

}
