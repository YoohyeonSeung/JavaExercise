package problem13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class solution {

	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
			BufferedReader in  = new BufferedReader(new FileReader("String.txt"));
			
			out.write("// This file contains 3 lines of code"
					+"public interface Dave {"
					+"    /**"
					+"    * count the number of lines in a file"
					+"     */"
					+"    int countLines(File inFile); // not the real signature!"
					+"}"
					);
			out.close();
			System.out.println(in.readLine());
			in.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
