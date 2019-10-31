package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main(String[]args) {
	String fileName="C:\\Users\\user\\Documents\\Software testing\\FiletoWrite.txt";
	String message="Happy Halloween :-)  :-)  ";
	File file= new File(fileName);
	
	try {
		FileWriter fw= new FileWriter(file);
		fw.write(message);
		fw.close();
	} catch (IOException e) {
		System.out.println("Error couldn't find: "+ fileName);
		e.printStackTrace();
	}
	
}
}
