package baek_problem_5585;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args){
		
		Scanner scan =  new Scanner(System.in); 
		
		int money = scan.nextInt();	
		
		int charge = 1000-money;
		
		int[] arr = {500, 100, 50, 10, 5, 1};
		
		int cnt = 0;		
		int i = 0;
		
		while(charge>0) {
			
			if(charge >= arr[i]) {
				cnt += charge/arr[i];
				charge = charge%arr[i];
			}
			i++;
			
		}
		System.out.println(cnt);
		
		
		
	}
}
