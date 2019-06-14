package baek_problem_9095;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 출력 받을 값의 갯수
		int n = scan.nextInt();
		
		int[] Output_arr = new int[n];
		
		int max = 0;
		
		for(int i = 0 ; i<n ; i++) {
			Output_arr[i] = scan.nextInt();
			if(Output_arr[i] > max)
				max = Output_arr[i];
		}
		int[] Arr = new int[max+1];
		
		Arr[1] = 1;
		Arr[2] = 2;
		Arr[3] = 4; 
		
		for(int i =4 ; i<=max ; i++) {
			
			Arr[i] = Arr[i-1]+Arr[i-2]+Arr[i-3];
						
		}
		
		for(int i = 0 ; i<n ; i++) {
			
			System.out.println(Arr[Output_arr[i]]);
			
		}		
	}
}
