package comp1721.cwk1;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class ActiveCases {
  // Implement program for full solution here
	static void ReadWriteFile(String filename1, String filename2) throws IOException {
		int count = -1;
		String s;
		BufferedReader fr = new BufferedReader(new FileReader(filename1));
		BufferedWriter fw = new BufferedWriter(new FileWriter(filename2));
		while ((s = fr.readLine()) != null)
		{
			fw.write(s);
			fw.write("\n");
			count += 1;
		}
		fr.close();
		fw.close();
		System.out.println(count);
	}
public static void main(String[] args) throws IOException{
	String filename1 = "../datafiles/2020-daily.csv";
	String filename2 = "../datafiles/2020-active.csv";
	if (filename1 == "" || filename2 == "")
	{
		System.out.println("You do not enter the name of file read or write!\n");
		System.exit(-1);
	}
	ReadWriteFile (filename1, filename2);
}
}
