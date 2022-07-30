package phase1_practice_projects;
import java.util.*;
import java.io.*;
public class FileHandling {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{
			
		//creates the empty file if not exists and write the content into the file
		//the boolean parameter is set to true to append the content into the file 
		FileWriter fw=new FileWriter("D:\\Assignments\\textfile.txt",true);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the content into the file");
		String s=sc.nextLine();
		fw.write(s);
		fw.close();
		
		//read the content from the file
		FileReader fr=new FileReader("D:\\Assignments\\textfile.txt");
		char c[]=new char[60];
		fr.read(c);
		System.out.println(c);
		System.out.println("Content is read from the file");
		fr.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
