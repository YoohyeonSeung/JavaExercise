package baek_problem_1009;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i<num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			arr[i] = Power(a, b);			
		}
		for(int i=0; i < num; i++ ) {
			System.out.println((int) arr[i]);
		}
	}
	
	public static int Power(int a, int b) {
		int result = 1;
		while(b>0) {
			result = (result*a)%10;
			b--;			
		}
		if (result == 0) {
			result = 10;
		}
		return result;
	}

}
