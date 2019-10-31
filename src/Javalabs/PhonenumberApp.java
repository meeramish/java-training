package Javalabs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhonenumberApp {

	public static void main(String[] args) {
		String fileName= "C:\\Users\\user\\Documents\\Software testing\\Notepadfile.txt";
		File file= new File(fileName);
		BufferedReader br;
		String phoneNum=null;
		try {
			br = new BufferedReader(new FileReader(file));
			phoneNum=br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found"+ fileName);
		} catch (IOException e) {
			System.out.println("Error: File not read"+ fileName);
		}
		
		System.out.println(phoneNum);
	}

}
