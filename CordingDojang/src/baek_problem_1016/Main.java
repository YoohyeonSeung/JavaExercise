package baek_problem_1016;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double min = scan.nextLong();
		double max = scan.nextLong();    
		
		
		int sqrt_min = (int) Math.sqrt(min);
		int sqrt_max = (int) Math.sqrt(max);
		
		if(  min > Math.pow(sqrt_min, 2)   ) {
			sqrt_min++;
		}
		
		
		int all_num = (int) ( max-min+1);
		
		int square_num = sqrt_max - sqrt_min+1;

		System.out.println(all_num - square_num);
		
	}
}
