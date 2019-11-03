package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class validPassword {

	public static void main(String[] args) {
		String[] password=new String[4];
		String fileName= "C:\\Users\\user\\Documents\\Software testing\\Notepadfile.txt";
		File file=new File(fileName);
		try {
			BufferedReader br= new BufferedReader(new FileReader(file));
			
			for(int i=0;i<password.length; i++) {
				password[i]=br.readLine();	
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found"+ fileName);
		} catch (IOException e) {
			System.out.println("Error: File not read"+ fileName);
		}
             for(String password1: password) {
            	 boolean invalidCharacter=false;
            	 boolean hasNumbers=false;
            	 boolean hasLetters=false;
            	 boolean specialChar=false;
            	 
            	 System.out.println(password1);
            	 for(int n=0;n<password1.length();n++) {
            		 if("0123456789".contains(password1.substring(n, n+1))) {
            			 //System.out.println("Position"+ n + "contains a number");
            			 hasNumbers=true;
            		 }
            		 //Condition 2: contains letter
            		 else if("abcdefghijklmnopqrstuvwxyz".contains(password1.substring(n,n+1))) {
            			 hasLetters=true;
            			 //System.out.println("position"+n+"contains a letter");
            		 }else if ("_'@,$?/`-".contains(password1.substring(n,n+1))) {
            			 specialChar=true;
            			 //System.out.println("position"+n+"contains special character");
            		 }else {
            			 invalidCharacter=true;
            			 //System.out.println("position"+n+"contains invalid character");
            		 }
            	 }
            	 if (!hasNumbers||!hasLetters||!specialChar) {
            		 System.out.println("Missing criteria");
            		 
            	 }else if(invalidCharacter) {
            		 System.out.println("invalid character");
            	 }else {
            		 System.out.println("Valid password");
            	 }
             }
	}

}
