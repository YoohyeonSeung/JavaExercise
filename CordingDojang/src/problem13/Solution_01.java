package problem13;

import java.io.BufferedReader;
import java.io.FileReader;

public class Solution_01 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(""
					+ "C:\\Users\\Hyeon-seung\\git\\JavaExercise\\CordingDojang\\src\\problem13\\sample.java"));
			int count = 0;
			while(in.ready()) {
				String str = in.readLine();
				System.out.println(str);
				str = str.replace(" ", "");
				String[] arr_str;
				arr_str = str.split("");
				if(arr_str[0].equals("/") || arr_str[0].equals("") || arr_str[0].equals("*")) {
					continue;
				}
				else {
					count+=1;
				}
				
			}
			System.out.println("코드 라인  수 : "+count);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
