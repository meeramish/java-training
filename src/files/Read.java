package files;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		//1.Define the file (path) that we want to read
		String fileName="C:\\Users\\user\\Documents\\Software testing\\Notepadfile.txt";
		String text=null;
		//Create file in Java
		File file=new File(fileName);
		
		//open the file
		
		try {
			BufferedReader br= new BufferedReader(new FileReader(file));
			//Read the file
			 text= br.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found"+ fileName);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Could not read the data:"+ fileName);
			e.printStackTrace();
		}finally {
			System.out.println("Finished reading.");
		}
		System.out.println(text);
	}
	}